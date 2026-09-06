package es.ies.p3.laboratorio.starter;

public class RecursoFormativo {
    private final String codigo;
    private final String nombre;
    private final int capacidad;
    private int ocupadas;

    public RecursoFormativo(String codigo, String nombre, int capacidad) {
        // TODO: deja todos los campos en estado válido y documenta la política.
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.ocupadas = 0;
    }

    public boolean reservar(int cantidad) {
        // TODO: rechaza cantidades inválidas sin cambiar el estado.
        return false;
    }

    public int plazasDisponibles() {
        return capacidad - ocupadas;
    }

    public String resumen() {
        return codigo + " | " + nombre + " | " + plazasDisponibles() + " disponibles";
    }
}

