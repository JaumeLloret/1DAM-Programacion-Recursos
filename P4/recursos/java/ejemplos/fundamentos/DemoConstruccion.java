public class DemoConstruccion {
    static class RecursoBase {
        private final String codigo;

        RecursoBase(String codigo) {
            this.codigo = codigo;
            System.out.println("1 | base | " + codigo);
        }

        public final String codigo() {
            return codigo;
        }
    }

    static final class Sala extends RecursoBase {
        private final int puestos;

        Sala(String codigo, int puestos) {
            super(codigo);
            this.puestos = puestos;
            System.out.println("2 | sala | puestos=" + puestos);
        }

        String resumen() {
            return codigo() + " | puestos=" + puestos;
        }
    }

    public static void main(String[] args) {
        Sala sala = new Sala("S-2", 24);
        System.out.println("3 | lista | " + sala.resumen());
    }
}
