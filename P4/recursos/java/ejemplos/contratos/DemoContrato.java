public class DemoContrato {
    interface Politica {
        /**
         * Calcula una prioridad para una base válida.
         *
         * @param base valor entre 1 y 10
         * @return prioridad entre 1 y 10
         */
        int calcular(int base);
    }

    static final class PoliticaConMargen implements Politica {
        @Override
        public int calcular(int base) {
            return Math.min(10, base + 1);
        }
    }

    static boolean contrato(int valor) {
        return valor >= 1 && valor <= 10;
    }

    public static void main(String[] args) {
        Politica politica = new PoliticaConMargen();
        int limite = politica.calcular(10);
        int ordinario = politica.calcular(4);
        System.out.println("limite=" + limite + " | contrato=" + contrato(limite));
        System.out.println("ordinario=" + ordinario + " | contrato=" + contrato(ordinario));
    }
}
