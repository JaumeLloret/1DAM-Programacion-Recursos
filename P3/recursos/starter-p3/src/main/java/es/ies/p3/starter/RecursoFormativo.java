package es.ies.p3.starter;

public class RecursoFormativo {
    private final String nombre;
    private final int capacidad;
    private int ocupadas;

    public RecursoFormativo(String nombre, int capacidad) {
        this.nombre = nombre == null || nombre.isBlank() ? "PENDIENTE" : nombre.strip();
        this.capacidad = Math.max(1, capacidad);
        this.ocupadas = 0;
    }

    public boolean reservar(int cantidad) {
        // TODO: validar y modificar sin romper 0 <= ocupadas <= capacidad.
        return false;
    }

    public int plazasDisponibles() {
        return capacidad - ocupadas;
    }

    public String resumen() {
        return nombre + " | " + plazasDisponibles() + " disponibles";
    }
}

