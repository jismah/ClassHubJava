package Logica;

import java.util.Date;

public class Student {

    protected String id;
    protected String name;
    protected String surname;
    protected String email;
    protected String idCarrera;
    protected String idMunicipio;
    protected Date fechaNacimiento;

    public Student(String id, String name, String surname, String email, String idCarrera) {
        super();
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.idCarrera = idCarrera;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(String idCarrera) {
        this.idCarrera = idCarrera;
    }
    
    public String getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(String idMunicipio) {
        this.idMunicipio = idMunicipio;
    }
    
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setfechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    
}
