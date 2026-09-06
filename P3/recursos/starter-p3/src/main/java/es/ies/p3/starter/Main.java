package es.ies.p3.starter;

public class Main {
    public static void main(String[] args) {
        RecursoFormativo recurso = new RecursoFormativo("Sala P3", 2);
        System.out.println(recurso.resumen());
        System.out.println("Reserva provisional=" + recurso.reservar(1));
        System.out.println(recurso.resumen());
    }
}

