
package Logica;

public class Period {
    
    protected String id;
    protected String numPerCursado;
    protected String status;

    public Period(String id, String numPerCursado, String status) {
        this.id = id;
        this.numPerCursado = numPerCursado;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumPerCursado() {
        return numPerCursado;
    }

    public void setNumPerCursado(String numPerCursado) {
        this.numPerCursado = numPerCursado;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
