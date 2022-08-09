
package Logica;

public class SubjectsXPeriod {
    protected String idSubject;
    protected String codMateria;
    protected String name;
    protected String nota;

    public SubjectsXPeriod(String idSubject, String codMateria, String name, String nota) {
        this.idSubject = idSubject;
        this.codMateria = codMateria;
        this.name = name;
        this.nota = nota;
    }

    public String getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(String idSubject) {
        this.idSubject = idSubject;
    }

    public String getCodMateria() {
        return codMateria;
    }

    public void setCodMateria(String codMateria) {
        this.codMateria = codMateria;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
}
