package es.ies.p3.ejemplos.biblioteca.modelo;

public class Participante {
    private final String nombre;

    public Participante(String nombre) {
        this.nombre = nombre == null || nombre.isBlank() ? "Sin nombre" : nombre.strip();
    }

    public String nombre() {
        return nombre;
    }
}

