package es.ies.p3.ejemplos.actividad;

public class Actividad {
    private final String titulo;
    private int minutosEstimados;
    private boolean completada;

    public Actividad(String titulo, int minutosEstimados) {
        this.titulo = titulo == null || titulo.isBlank() ? "Sin título" : titulo.strip();
        this.minutosEstimados = Math.max(1, minutosEstimados);
        this.completada = false;
    }

    public void marcarComoCompletada() {
        completada = true;
    }

    public void reabrir() {
        completada = false;
    }

    public boolean cambiarEstimacion(int minutos) {
        if (completada || minutos < 1) {
            return false;
        }
        minutosEstimados = minutos;
        return true;
    }

    public boolean estaCompletada() {
        return completada;
    }

    public int minutosEstimados() {
        return minutosEstimados;
    }

    public String resumen() {
        return titulo + " | " + minutosEstimados + " min | "
                + (completada ? "completada" : "pendiente");
    }
}

