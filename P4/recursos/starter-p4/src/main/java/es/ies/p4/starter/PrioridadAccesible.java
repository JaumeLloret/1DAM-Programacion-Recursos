package es.ies.p4.starter;

public final class PrioridadAccesible implements PoliticaPrioridad {
    @Override
    public int calcular(int base) {
        return Math.min(10, base + 2);
    }
}
