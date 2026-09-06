package es.ies.p3.laboratorio.starter;

public class DemoLaboratorio {
    public static void main(String[] args) {
        Participante participante = new Participante("Ada");
        RecursoFormativo recurso = new RecursoFormativo("R-01", "Sala P3", 2);
        Reserva reserva = new Reserva(participante, recurso);
        System.out.println(reserva.resumen());
        System.out.println("Confirmación provisional=" + reserva.confirmar());
        System.out.println(reserva.resumen());
    }
}

