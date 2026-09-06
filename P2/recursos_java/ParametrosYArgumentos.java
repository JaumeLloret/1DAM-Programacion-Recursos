public class ParametrosYArgumentos {
    public static boolean dentroDeRango(int valor, int minimo, int maximo) {
        return valor >= minimo && valor <= maximo;
    }

    public static void main(String[] args) {
        int retraso = 12;
        boolean aceptado = dentroDeRango(retraso, 0, 15);
        System.out.println("Retraso aceptado: " + aceptado);
        System.out.println("Nota válida: " + dentroDeRango(9, 0, 10));
    }
}
