package es.ies.p3.laboratorio.starter;

public class Participante {
    private final String nombre;

    public Participante(String nombre) {
        // TODO: documenta y aplica una política para null o texto en blanco.
        this.nombre = nombre;
    }

    public String nombre() {
        return nombre;
    }
}

