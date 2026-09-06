public class DemoMatriz {
    public static void main(String[] args) {
        String[] actividades = new String[3];
        actividades[0] = "Diseño";
        actividades[2] = "Prueba";

        int[][] ocupacion = {{1, 0, 2}, {3, 1}};
        int total = 0;
        for (int fila = 0; fila < ocupacion.length; fila++) {
            for (int columna = 0; columna < ocupacion[fila].length; columna++) {
                total += ocupacion[fila][columna];
            }
        }
        System.out.println("posicion-1-null=" + (actividades[1] == null));
        System.out.println("filas=" + ocupacion.length + " | total=" + total);
    }
}
