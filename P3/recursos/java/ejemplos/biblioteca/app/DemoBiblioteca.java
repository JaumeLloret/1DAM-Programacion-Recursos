package es.ies.p3.ejemplos.biblioteca.app;

import es.ies.p3.ejemplos.biblioteca.modelo.Participante;
import es.ies.p3.ejemplos.biblioteca.modelo.Recurso;
import es.ies.p3.ejemplos.biblioteca.modelo.Reserva;

public class DemoBiblioteca {
    public static void main(String[] args) {
        Participante ana = new Participante(" Ana ");
        Recurso sala = new Recurso("R-01", "Sala POO", 1);
        Reserva reserva = new Reserva(ana, sala);
        System.out.println("confirmada=" + reserva.confirmar());
        System.out.println(reserva.resumen());
        System.out.println("disponibles=" + sala.plazasDisponibles());
    }
}

