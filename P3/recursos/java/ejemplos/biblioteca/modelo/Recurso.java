package es.ies.p3.ejemplos.biblioteca.modelo;

public class Recurso {
    private final String codigo;
    private final String titulo;
    private final int capacidad;
    private int ocupadas;

    public Recurso(String codigo, String titulo, int capacidad) {
        this.codigo = codigo == null || codigo.isBlank() ? "SIN-COD" : codigo.strip();
        this.titulo = titulo == null || titulo.isBlank() ? "Sin nombre" : titulo.strip();
        this.capacidad = Math.max(1, capacidad);
    }

    public boolean reservarUnaPlaza() {
        if (ocupadas >= capacidad) {
            return false;
        }
        ocupadas++;
        return true;
    }

    public int plazasDisponibles() {
        return capacidad - ocupadas;
    }

    public String etiqueta() {
        return codigo + " | " + titulo;
    }
}

