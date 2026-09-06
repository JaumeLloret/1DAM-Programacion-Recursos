package es.ies.p3.ejemplos.contador;

public class Contador {
    private final String nombre;
    private int valor;

    public Contador(String nombre) {
        this.nombre = nombre == null || nombre.isBlank() ? "Sin nombre" : nombre.strip();
        this.valor = 0;
    }

    public void incrementar() {
        valor++;
    }

    public void reiniciar() {
        valor = 0;
    }

    public int valor() {
        return valor;
    }

    public String resumen() {
        return nombre + "=" + valor;
    }
}

