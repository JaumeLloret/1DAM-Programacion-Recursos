import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class LaboratorioPlantilla {
    public static String normalizarEtiqueta(String texto) {
        // TODO: implementar sin leer del teclado ni mostrar por pantalla.
        return texto;
    }

    public static boolean sonDatosValidos(int retraso, double puntuacion) {
        // TODO.
        return false;
    }

    public static boolean esEntregaAceptada(int retraso) {
        // Precondición: retraso >= 0.
        // TODO.
        return false;
    }

    public static double calcularPuntuacionFinal(double puntuacionInicial, int retraso) {
        // Precondiciones: 0 <= puntuacionInicial <= 10 y retraso >= 0.
        // TODO: utilizar al menos un método estático de biblioteca.
        return 0.0;
    }

    public static String crearInforme(
            LocalDate fecha,
            String estudiante,
            String actividad,
            int retraso,
            double puntuacionFinal) {
        // TODO: instanciar y utilizar un objeto de clase predefinida.
        return "";
    }

    public static void mostrarInforme(String informe) {
        // TODO: justificar por qué este método sí puede ser void.
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Estudiante: ");
        String estudiante = teclado.nextLine();
        System.out.print("Actividad: ");
        String actividad = teclado.nextLine();
        System.out.print("Retraso en minutos: ");
        int retraso = Integer.parseInt(teclado.nextLine());
        System.out.print("Puntuación inicial: ");
        double puntuacionInicial = Double.parseDouble(teclado.nextLine());

        // TODO: coordinar llamadas y preservar exactamente el comportamiento base.
    }
}
