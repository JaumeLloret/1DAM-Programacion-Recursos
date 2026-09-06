package es.ies.p3.laboratorio.starter;

public class Reserva {
    private final Participante participante;
    private final RecursoFormativo recurso;
    private boolean confirmada;

    public Reserva(Participante participante, RecursoFormativo recurso) {
        this.participante = participante;
        this.recurso = recurso;
        this.confirmada = false;
    }

    public boolean confirmar() {
        // TODO: colabora con recurso y evita confirmar dos veces.
        return false;
    }

    public String resumen() {
        return participante.nombre() + " | " + recurso.resumen() + " | "
                + (confirmada ? "confirmada" : "pendiente");
    }
}

