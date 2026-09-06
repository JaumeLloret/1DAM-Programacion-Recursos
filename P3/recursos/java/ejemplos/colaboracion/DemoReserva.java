package es.ies.p3.ejemplos.colaboracion;

public class DemoReserva {
    public static void main(String[] args) {
        Recurso sala = new Recurso("Sala POO", 2);
        Reserva primera = new Reserva(sala);
        Reserva segunda = new Reserva(sala);
        Reserva tercera = new Reserva(sala);

        System.out.println("R1=" + primera.confirmar() + " | libres=" + sala.plazasDisponibles());
        System.out.println("R1 otra vez=" + primera.confirmar() + " | libres=" + sala.plazasDisponibles());
        System.out.println("R2=" + segunda.confirmar() + " | libres=" + sala.plazasDisponibles());
        System.out.println("R3=" + tercera.confirmar() + " | libres=" + sala.plazasDisponibles());
    }
}

