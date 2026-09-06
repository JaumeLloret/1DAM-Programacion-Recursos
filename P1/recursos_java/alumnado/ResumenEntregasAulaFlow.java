public class ResumenEntregasAulaFlow {
    public static void main(String[] args) {
        final int RETRASO_MAXIMO_MINUTOS = 15;
        int aceptadas = 0;
        int enRevision = 0;

        for (int entrega = 1; entrega <= 4; entrega++) {
            int minutosRetraso = entrega * 5;

            if (minutosRetraso <= RETRASO_MAXIMO_MINUTOS) {
                aceptadas++;
            } else {
                enRevision++;
            }
        }

        System.out.println("Aceptadas: " + aceptadas);
        System.out.println("En revisión: " + enRevision);
    }
}
