public class DemoAssert {
    private static int cargaInterna = -1;

    private static void verificarInvariante() {
        assert cargaInterna >= 0 : "carga interna negativa";
    }

    public static void main(String[] args) {
        System.out.println("antes-assert");
        verificarInvariante();
        System.out.println("ASSERT-DESACTIVADO");
    }
}
