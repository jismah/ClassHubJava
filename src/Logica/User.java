package Logica;

public class User {

    protected String id;
    protected String username;
    protected String password;
    protected String idStudent;

    public User(String id, String username, String password, String idStudent) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.idStudent = idStudent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getIdStudent(){
        return idStudent;
    }
    
    public void setIdStudent(String idStudent){
        this.idStudent = idStudent;
    }

}
