package upc.programacion3.sistemaacademicoDJD;

import java.util.ArrayList;
import java.util.List;

public class NotaService {

    private List<Nota> listaNotas;

    public NotaService() {
        this.listaNotas = new ArrayList<>();
    }

    public void registrarNota(Nota nota) {
        listaNotas.add(nota);
    }

    public List<Nota> listarNotas() {
        return listaNotas;
    }

    public Nota buscarNota(Estudiante estudiante, Asignatura asignatura) {

        for (Nota nota : listaNotas) {
            if (nota.getEstudiante().equals(estudiante)
                    && nota.getAsignatura().equals(asignatura)) {
                return nota;
            }
        }

        return null;
    }

    public boolean actualizarNota(Estudiante estudiante,
                                  Asignatura asignatura,
                                  double nuevoValor) {

        Nota nota = buscarNota(estudiante, asignatura);

        if (nota != null) {
            nota.setValor(nuevoValor);
            return true;
        }

        return false;
    }

    public boolean eliminarNota(Estudiante estudiante, Asignatura asignatura) {

        Nota nota = buscarNota(estudiante, asignatura);

        if (nota != null) {
            listaNotas.remove(nota);
            return true;
        }

        return false;
    }
}