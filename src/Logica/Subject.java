package Logica;

public class Subject {

    protected String id;
    protected String name;
    protected int credits;
    protected String codSubject;

    public Subject(String id, String name, int credits, String codSubject) {
        super();
        this.id = id;
        this.name = name;
        this.credits = credits;
        this.codSubject = codSubject;
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
    
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    public String getCodSubject() {
        return codSubject;
    }

    public void setCodSubject(String codSubject) {
        this.codSubject = codSubject;
    }
}
