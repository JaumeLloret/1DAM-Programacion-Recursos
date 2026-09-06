public class ReglaEntregaAulaFlow {
    public static void main(String[] args) {
        final int RETRASO_MAXIMO_MINUTOS = 15;
        int minutosRetraso = 15;

        if (minutosRetraso < 0) {
            System.out.println("Dato de retraso no válido");
        } else if (minutosRetraso <= RETRASO_MAXIMO_MINUTOS) {
            System.out.println("Entrega aceptada");
        } else {
            System.out.println("Entrega pendiente de revisión");
        }
    }
}
