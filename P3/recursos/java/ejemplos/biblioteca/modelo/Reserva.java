package es.ies.p3.ejemplos.biblioteca.modelo;

public class Reserva {
    private final Participante participante;
    private final Recurso recurso;
    private boolean confirmada;

    public Reserva(Participante participante, Recurso recurso) {
        this.participante = participante;
        this.recurso = recurso;
    }

    public boolean confirmar() {
        if (confirmada || !recurso.reservarUnaPlaza()) {
            return false;
        }
        confirmada = true;
        return true;
    }

    public String resumen() {
        return participante.nombre() + " → " + recurso.etiqueta() + " | "
                + (confirmada ? "confirmada" : "pendiente");
    }
}

