public class ConversionesBasicas {
    public static void main(String[] args) {
        int entero = 9;
        double conversionImplicita = entero;
        double divisionDecimal = (double) entero / 2;
        int conversionExplicita = (int) 8.9;

        System.out.println("Conversión implícita: " + conversionImplicita);
        System.out.println("División decimal: " + divisionDecimal);
        System.out.println("Conversión explícita: " + conversionExplicita);
    }
}
