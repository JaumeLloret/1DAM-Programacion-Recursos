import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class LaboratorioMonolitico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Estudiante: ");
        String estudiante = teclado.nextLine().strip().toUpperCase(Locale.ROOT);
        System.out.print("Actividad: ");
        String actividad = teclado.nextLine().strip().toUpperCase(Locale.ROOT);
        System.out.print("Retraso en minutos: ");
        int retraso = Integer.parseInt(teclado.nextLine());
        System.out.print("Puntuación inicial: ");
        double puntuacionInicial = Double.parseDouble(teclado.nextLine());

        if (retraso < 0 || puntuacionInicial < 0.0 || puntuacionInicial > 10.0) {
            System.out.println("Datos no válidos");
            return;
        }

        boolean aceptada = retraso <= 15;
        int minutosPenalizados = Math.max(0, retraso - 15);
        double puntuacionFinal = Math.max(0.0, puntuacionInicial - minutosPenalizados * 0.1);
        puntuacionFinal = Math.round(puntuacionFinal * 100.0) / 100.0;

        LocalDate fecha = LocalDate.of(2026, 10, 20);
        StringBuilder informe = new StringBuilder();
        informe.append("=== REVISIÓN DE ENTREGA ===\n");
        informe.append("Fecha: ").append(fecha).append('\n');
        informe.append("Estudiante: ").append(estudiante).append('\n');
        informe.append("Actividad: ").append(actividad).append('\n');
        informe.append("Retraso: ").append(retraso).append(" min\n");
        informe.append("Estado: ").append(aceptada ? "ACEPTADA" : "REVISIÓN").append('\n');
        informe.append("Puntuación final: ").append(puntuacionFinal);

        System.out.println(informe);
    }
}
