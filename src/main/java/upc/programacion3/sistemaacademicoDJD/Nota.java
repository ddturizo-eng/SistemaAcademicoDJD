package upc.programacion3.sistemaacademicoDJD;

import java.util.ArrayList;
import java.util.List;

public class Nota {

    private Estudiante estudiante;
    private Asignatura asignatura;
    private double valor;
    private String periodo;

    private static List<Nota> listaNotas = new ArrayList<>();

    public Nota(Estudiante estudiante, Asignatura asignatura, double valor, String periodo) {
        this.estudiante = estudiante;
        this.asignatura = asignatura;
        this.valor = valor;
        this.periodo = periodo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public static void registrarNota(Nota nota) {
        listaNotas.add(nota);
    }

    public static List<Nota> listarNotas() {
        return listaNotas;
    }

    public static Nota buscarNota(Estudiante estudiante, Asignatura asignatura) {

        for (Nota nota : listaNotas) {
            if (nota.getEstudiante().equals(estudiante)
                    && nota.getAsignatura().equals(asignatura)) {
                return nota;
            }
        }

        return null;
    }

    public static boolean actualizarNota(Estudiante estudiante,
                                         Asignatura asignatura,
                                         double nuevoValor) {

        Nota nota = buscarNota(estudiante, asignatura);

        if (nota != null) {
            nota.setValor(nuevoValor);
            return true;
        }

        return false;
    }

    public static boolean eliminarNota(Estudiante estudiante,
                                       Asignatura asignatura) {

        Nota nota = buscarNota(estudiante, asignatura);

        if (nota != null) {
            listaNotas.remove(nota);
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "estudiante=" + estudiante +
                ", asignatura=" + asignatura +
                ", valor=" + valor +
                ", periodo='" + periodo + '\'' +
                '}';
    }
}