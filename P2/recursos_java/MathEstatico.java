public class MathEstatico {
    public static double limitarPuntuacion(double puntuacion) {
        return Math.min(10.0, Math.max(0.0, puntuacion));
    }

    public static void main(String[] args) {
        System.out.println(limitarPuntuacion(7.5));
        System.out.println(limitarPuntuacion(-2.0));
        System.out.println(limitarPuntuacion(12.0));
    }
}
