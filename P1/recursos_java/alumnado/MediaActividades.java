public class MediaActividades {
    public static void main(String[] args) {
        int puntosTotales = 17;
        int numeroActividades = 4;

        double mediaIncorrecta = puntosTotales / numeroActividades;
        double mediaCorrecta = (double) puntosTotales / numeroActividades;

        System.out.println("Media incorrecta: " + mediaIncorrecta);
        System.out.println("Media correcta: " + mediaCorrecta);
    }
}
