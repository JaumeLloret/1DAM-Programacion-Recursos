import java.time.LocalDate;

public class LecturaApiFecha {
    public static void main(String[] args) {
        LocalDate fechaEntrega = LocalDate.of(2026, 10, 21);
        LocalDate fechaRevision = fechaEntrega.plusDays(2);

        System.out.println("Día: " + fechaEntrega.getDayOfWeek());
        System.out.println("Revisión: " + fechaRevision);
        System.out.println("Mismo objeto: " + (fechaEntrega == fechaRevision));
    }
}
