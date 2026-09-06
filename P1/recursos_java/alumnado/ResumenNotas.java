import java.util.Scanner;

public class ResumenNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int notasValidas = 0;
        int aprobadas = 0;
        int sumaNotas = 0;

        System.out.print("Nota entre 0 y 10; -1 termina: ");
        int nota = entrada.nextInt();

        while (nota != -1) {
            if (nota >= 0 && nota <= 10) {
                notasValidas++;
                sumaNotas += nota;

                if (nota >= 5) {
                    aprobadas++;
                }
            } else {
                System.out.println("Nota ignorada por estar fuera de rango");
            }

            System.out.print("Siguiente nota; -1 termina: ");
            nota = entrada.nextInt();
        }

        System.out.println("Notas válidas: " + notasValidas);
        System.out.println("Aprobadas: " + aprobadas);

        if (notasValidas > 0) {
            double media = (double) sumaNotas / notasValidas;
            System.out.println("Media: " + media);
        } else {
            System.out.println("No hay notas para calcular la media");
        }
    }
}
