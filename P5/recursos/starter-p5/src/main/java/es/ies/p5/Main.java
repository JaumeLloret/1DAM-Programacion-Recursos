package es.ies.p5;

public class Main {
    public static void main(String[] args) throws CodigoInvalidoException {
        Agenda agenda = new Agenda();
        agenda.añadir(new Registro<>("P5-AA-26", "Datos"));
        System.out.println("starter-p5 | cantidad=" + agenda.cantidad());
    }
}
