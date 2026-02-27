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
}