public class DemoStrategy {
    interface PoliticaPrioridad {
        int calcular(int base);
    }

    static final class PrioridadNormal implements PoliticaPrioridad {
        @Override
        public int calcular(int base) {
            return base;
        }
    }

    static final class PrioridadAccesible implements PoliticaPrioridad {
        @Override
        public int calcular(int base) {
            return Math.min(10, base + 2);
        }
    }

    static final class CalculadorTurno {
        private final PoliticaPrioridad politica;

        CalculadorTurno(PoliticaPrioridad politica) {
            this.politica = politica;
        }

        int prioridad(int base) {
            return politica.calcular(base);
        }
    }

    public static void main(String[] args) {
        CalculadorTurno normal = new CalculadorTurno(new PrioridadNormal());
        CalculadorTurno accesible = new CalculadorTurno(new PrioridadAccesible());
        System.out.println("normal=" + normal.prioridad(4));
        System.out.println("accesible=" + accesible.prioridad(4));
    }
}
