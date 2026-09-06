import java.util.Scanner;

public class NotaIntroducida {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce una nota entre 0 y 10: ");
        int nota = entrada.nextInt();

        if (nota >= 0 && nota <= 10) {
            System.out.println("Nota aceptada: " + nota);
        } else {
            System.out.println("Nota fuera de rango");
        }
    }
}
