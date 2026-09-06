public class RetornoOVoid {
    public static double calcularImporteFinal(double precio, int unidades) {
        return precio * unidades;
    }

    public static void mostrarLinea(String concepto, double importe) {
        System.out.println(concepto + ": " + importe + " €");
    }

    public static void main(String[] args) {
        double importe = calcularImporteFinal(12.5, 3);
        mostrarLinea("Cuadernos", importe);
        System.out.println("Con descuento: " + (importe - 5.0) + " €");
    }
}
