public class PrecioEnCentimos {
    public static void main(String[] args) {
        final int CENTIMOS_POR_EURO = 100;
        int precioCentimos = 1_375;

        int euros = precioCentimos / CENTIMOS_POR_EURO;
        int centimos = precioCentimos % CENTIMOS_POR_EURO;

        System.out.println("Euros completos: " + euros);
        System.out.println("Céntimos restantes: " + centimos);
    }
}
