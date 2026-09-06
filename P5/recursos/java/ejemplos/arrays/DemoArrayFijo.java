public class DemoArrayFijo {
    public static void main(String[] args) {
        int[] carga = {3, 1, 4, 0, 2};
        int total = 0;
        for (int i = 0; i < carga.length; i++) {
            total += carga[i];
            System.out.println("dia=" + i + " | carga=" + carga[i]);
        }
        System.out.println("longitud=" + carga.length + " | total=" + total);
    }
}
