package upc.programacion3.sistemaacademicoDJD;

public class Asignatura {

    private String nombre;
    private String codigo;
    private int creditos;
    private String docente;

    public Asignatura(String nombre, String codigo, int creditos, String docente) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.docente = docente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", creditos=" + creditos +
                ", docente='" + docente + '\'' +
                '}';
    }
}