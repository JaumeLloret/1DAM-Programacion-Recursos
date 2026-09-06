package es.ies.p3.ejemplos.colaboracion;

public class Recurso {
    private final String nombre;
    private final int capacidad;
    private int ocupadas;

    public Recurso(String nombre, int capacidad) {
        this.nombre = nombre == null || nombre.isBlank() ? "Sin nombre" : nombre.strip();
        this.capacidad = Math.max(1, capacidad);
        this.ocupadas = 0;
    }

    public boolean reservar(int cantidad) {
        if (cantidad <= 0 || cantidad > plazasDisponibles()) {
            return false;
        }
        ocupadas += cantidad;
        return true;
    }

    public int plazasDisponibles() {
        return capacidad - ocupadas;
    }

    public String nombre() {
        return nombre;
    }
}

