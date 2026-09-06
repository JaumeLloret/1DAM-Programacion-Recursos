public class CalculoDescuento {
    public static double calcularPrecioFinal(double precioBase, double descuentoPorcentaje) {
        double descuento = precioBase * descuentoPorcentaje / 100.0;
        return precioBase - descuento;
    }

    public static void main(String[] args) {
        double precioFinal = calcularPrecioFinal(80.0, 15.0);
        System.out.println("Precio final: " + precioFinal);
    }
}
