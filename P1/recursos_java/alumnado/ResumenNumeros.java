public class ResumenNumeros {
    public static void main(String[] args) {
        int suma = 0;
        int cantidadPares = 0;

        for (int numero = 1; numero <= 6; numero++) {
            suma += numero;

            if (numero % 2 == 0) {
                cantidadPares++;
            }
        }

        System.out.println("Suma: " + suma);
        System.out.println("Cantidad de pares: " + cantidadPares);
    }
}
