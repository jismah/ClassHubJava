package Logica;

import BD.Conexion;
import java.sql.*;
import java.util.ArrayList;

public class Core {

    private ArrayList<User> users;
    private ArrayList<Student> students;
    private ArrayList<Subject> subjects;
    private ArrayList<Teacher> teachers;
    private ArrayList<Period> periods;
    private ArrayList<SubjectsXPeriod> subjectsXPeriods;
    public static Core core = null;
    public static User loggedUser;

    private Core() {
        super();
        this.users = new ArrayList<User>();
        this.periods = new ArrayList<Period>();
        this.students = new ArrayList<Student>();
        this.subjects = new ArrayList<Subject>();
        this.teachers = new ArrayList<Teacher>();
        this.subjectsXPeriods = new ArrayList<SubjectsXPeriod>();

    }

    public static Core getInstance() {
        if (core == null) {
            core = new Core();
        }

        return core;
    }

    public ArrayList<SubjectsXPeriod> getSubjectsXPeriod() {
        return subjectsXPeriods;
    }

    public void setSubjectsXPeriod(ArrayList<SubjectsXPeriod> subjectsXPeriod) {
        this.subjectsXPeriods = subjectsXPeriod;
    }

    public ArrayList<Period> getPeriods() {
        return periods;
    }

    public void setPeriods(ArrayList<Period> periods) {
        this.periods = periods;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public static User getLoggedUser() {
        return loggedUser;
    }

    public static void setLoggedUser(User loggedUser) {
        Core.loggedUser = loggedUser;
    }

    public boolean validate(String username, String password) {
        boolean matches = false;
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                loggedUser = user;
                matches = true;
            }
        }
        return matches;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addSubjectsXPeriod(SubjectsXPeriod subjectsXPeriod) {
        subjectsXPeriods.add(subjectsXPeriod);
    }

    public void addPeriod(Period period) {
        periods.add(period);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public static Core getStore() {
        return core;
    }

    // FUNCIONES DE BUSQUEDA
    public User search_user(String id) {
        User searched = null;
        for (User user : users) {
            if (user.getId().equalsIgnoreCase(id)) {
                searched = user;
            }
        }
        return searched;
    }

// RETORNAR DATA DE ESTUDIANTE DEL USUARIO LOGUEADO
    public Student getDataUserStudentLogged(String id) {
        Student searched = null;
        for (Student s : students) {
            if (s.getId().equalsIgnoreCase(id)) {
                searched = s;
            }
        }
        return searched;
    }

    // FUNCIONES DE CONEXIONES A BD Y CORE
// Cargar estudiantes desde la BD al Sistema
    public void pullAllStudents() {
        String queryAllStudents = "SELECT idEstudiante, nombre, apellido, correo, idCarrera, idMunicipio, fechaNacimiento FROM Estudiante";
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(queryAllStudents);
            ResultSet rs = ps.executeQuery();

            int rowcount = 0;
            while (rs.next()) {
                String id = rs.getString("idEstudiante");
                String name = rs.getString("nombre");
                String surname = rs.getString("apellido");
                String email = rs.getString("correo");
                String idCarrera = rs.getString("idCarrera");

                Student aux = new Student(id, name, surname, email, idCarrera);
                addStudent(aux);
                rowcount++;
            }
            System.out.println("Estudiantes Cargados Desde La BD!");
            //for(Student s: students){
            //System.out.println(s.id);
            //}
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

// Cargar todas las Materias desde la BD
    public void pullAllSubjects(String idCareer) {
        String queryAllSubjects = "{CALL dbo.getSubjectsFromCareer(" + idCareer + ")}";
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(queryAllSubjects);
            ResultSet rs = ps.executeQuery();

            int rowcount = 0;
            while (rs.next()) {
                String id = rs.getString("idMateria");
                String name = rs.getString("nombre");
                int credits = rs.getInt("credito");
                String codMateria = rs.getString("codMateria");

                Subject aux = new Subject(id, name, credits, codMateria);
                addSubject(aux);
                rowcount++;
            }
            System.out.println("Materias De La Carrera Cargadas Desde La BD!");
            //for(Subject s: subjects){
            //System.out.println(s.name);
            //}
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public String getLastPeriod() {

        String idPeriod = "";
        for (Period s : periods) {
            if (s.status.equals("En proceso")) {
                idPeriod = s.id;
            }
        }
        return idPeriod;
    }

// Cargar materias del periodo actual
    public void pullSubjectsXPeriodActive(String idStudent) {

        ArrayList<Period> listPeriods = Core.getInstance().getPeriods();
        String idPeriod = getLastPeriod();

        String querySubjectsByPeriod = "{CALL dbo.getSubjectsByPeriodActive(?, ?)}";
        try {
            Connection con = Conexion.getConexion();
            CallableStatement cs = con.prepareCall(querySubjectsByPeriod);
            cs.setString("idPeriod", idPeriod);
            cs.setString("idStudent", idStudent);
            ResultSet rs = cs.executeQuery();

            int rowcount = 0;
            while (rs.next()) {
                String id = rs.getString("idMateria");
                String codMateria = rs.getString("codMateria");
                String name = rs.getString("nombre");
                String nota = rs.getString("nota");

                SubjectsXPeriod aux = new SubjectsXPeriod(id, codMateria, name, nota);
                addSubjectsXPeriod(aux);
                rowcount++;
            }
            //System.out.println("Materias De La Carrera Cargadas Desde La BD!");
            for (SubjectsXPeriod s : subjectsXPeriods) {
                System.out.println(s.name);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

// Cargar los periodos del estudiante desde la BD
    public void pullPeriodosByIdStudent(String idStudent) {
        String queryAllSubjects = "{CALL dbo.getPeriodosByStudent(" + idStudent + ")}";
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(queryAllSubjects);
            ResultSet rs = ps.executeQuery();

            int rowcount = 0;
            while (rs.next()) {
                String id = rs.getString("idPeriodo");
                String numPerCursado = rs.getString("numPerCursado");
                String status = rs.getString("statusPeriodo");

                Period aux = new Period(id, numPerCursado, status);
                addPeriod(aux);
                rowcount++;
            }
            System.out.println("Periodos Del Estudiante Cargados Desde La BD!");
            // for(Period s: periods){
            //     System.out.println(s.status);
            // }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

// Cargar todos los Profesores desde la BD
    public void pullAllTeachers() {
        String queryAllTeachers = "SELECT idProfesor, nombre, apellido FROM Profesor";
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(queryAllTeachers);
            ResultSet rs = ps.executeQuery();

            int rowcount = 0;
            while (rs.next()) {
                String id = rs.getString("idProfesor");
                String name = rs.getString("nombre");
                String surname = rs.getString("apellido");

                Teacher aux = new Teacher(id, name, surname);
                addTeacher(aux);
                rowcount++;
            }
            System.out.println("Profesores Cargados Desde La BD!");
//            for(Teacher t: teachers){
//            System.out.println(t.name);
//            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

// Llamar SP de Carrera
    public String getNameCarrera(int idCarrera) {

        String resultado = "";
        try {
            java.sql.Connection con = Conexion.getConexion();
            CallableStatement cmd = con.prepareCall("EXEC obtenerNomCarrera @idCarrera=" + idCarrera + "");
            ResultSet rs = cmd.executeQuery();

            while (rs.next()) {
                resultado = rs.getString(1);
            }

        } catch (SQLException e) {

        }
        return resultado;
    }

// Calcular edad de Estudiante
    public String getAge(String idLogged) {

        String fecha = "";
        String resultado = "";
        try {
            java.sql.Connection con = Conexion.getConexion();
            CallableStatement queryGetDate = con.prepareCall("SELECT fechaNacimiento FROM Estudiante WHERE idEstudiante = " + idLogged + "");
            ResultSet rsQueryGetDate = queryGetDate.executeQuery();

            if (rsQueryGetDate.next()) {
                fecha = rsQueryGetDate.getString(1);
                CallableStatement queryGetAge = con.prepareCall("SELECT dbo.calcularEdad('" + fecha + "')");
                ResultSet rsQueryGetAge = queryGetAge.executeQuery();

                while (rsQueryGetAge.next()) {
                    resultado = rsQueryGetAge.getString(1);
                }
            }

        } catch (SQLException e) {

        }
        return resultado;
    }
}
