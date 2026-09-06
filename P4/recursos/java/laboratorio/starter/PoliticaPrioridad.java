public interface PoliticaPrioridad {
    /**
     * Calcula la prioridad de una solicitud.
     *
     * @param base prioridad inicial entre 1 y 10
     * @return prioridad final entre 1 y 10
     */
    int calcular(int base);
}
