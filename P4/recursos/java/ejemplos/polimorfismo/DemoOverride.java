public class DemoOverride {
    static class Tarifa {
        public int coste(int minutos) {
            return minutos * 2;
        }
    }

    static final class TarifaReducida extends Tarifa {
        @Override
        public int coste(int minutos) {
            return minutos;
        }

        public int coste(double minutos) {
            return (int) minutos;
        }
    }

    public static void main(String[] args) {
        Tarifa tarifa = new TarifaReducida();
        System.out.println("override=" + tarifa.coste(30));
        TarifaReducida concreta = new TarifaReducida();
        System.out.println("overload=" + concreta.coste(30.5));
    }
}
