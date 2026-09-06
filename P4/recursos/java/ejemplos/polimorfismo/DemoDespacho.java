public class DemoDespacho {
    static class RecursoBase {
        public String operacion() {
            return "base";
        }

        public String centro() {
            return "CENTRO";
        }

        public static String categoria() {
            return "tipo-base";
        }
    }

    static final class RecursoConcreto extends RecursoBase {
        private final String codigo;

        RecursoConcreto(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String operacion() {
            return "concreta:" + codigo;
        }

        public String detalle() {
            return "solo-concreta";
        }
    }

    public static void main(String[] args) {
        RecursoBase x = new RecursoConcreto("R-1");
        System.out.println("sobrescrito=" + x.operacion());
        System.out.println("heredado=" + x.centro());
        System.out.println("estatico=" + RecursoBase.categoria());
        // x.detalle(); // No compila: el tipo declarado no expone detalle().
    }
}
