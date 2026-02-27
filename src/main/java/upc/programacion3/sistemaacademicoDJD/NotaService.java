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
}