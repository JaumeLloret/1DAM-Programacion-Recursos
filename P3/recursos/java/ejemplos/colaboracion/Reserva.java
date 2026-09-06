package es.ies.p3.ejemplos.colaboracion;

public class Reserva {
    private final Recurso recurso;
    private boolean confirmada;

    public Reserva(Recurso recurso) {
        this.recurso = recurso;
        this.confirmada = false;
    }

    public boolean confirmar() {
        if (confirmada || !recurso.reservar(1)) {
            return false;
        }
        confirmada = true;
        return true;
    }

    public boolean estaConfirmada() {
        return confirmada;
    }
}

