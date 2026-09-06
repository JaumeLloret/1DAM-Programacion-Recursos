public class DemoLaboratorio {
    public static void main(String[] args)
            throws CodigoActividadInvalidoException, ActividadDuplicadaException {
        AgendaActividades agenda = new AgendaActividades();
        agenda.registrar(new Actividad("AF-TST-102", "Caso límite", 2, 1, Estado.CANCELADA));
        agenda.registrar(new Actividad("AF-DEV-101", "Revisar contratos", 4, 0, Estado.ACTIVA));
        agenda.registrar(new Actividad("AF-DOC-103", "Documentar", 3, 2, Estado.CANCELADA));
        System.out.println("ESC-01 | size=" + agenda.size() + " | carga=" + agenda.cargaTotal());

        try {
            agenda.registrar(new Actividad("AF-dev-123", "Inválida", 1, 0, Estado.ACTIVA));
        } catch (CodigoActividadInvalidoException e) {
            System.out.println("ESC-02 | codigo-invalido | size=" + agenda.size());
        }

        try {
            agenda.registrar(new Actividad("AF-DEV-101", "Duplicada", 1, 0, Estado.ACTIVA));
        } catch (ActividadDuplicadaException e) {
            System.out.println("ESC-03 | duplicada=" + e.codigo());
        }

        Resultado<Actividad> encontrada = agenda.buscar("AF-DEV-101");
        Resultado<Actividad> ausente = agenda.buscar("AF-NON-999");
        System.out.println("ESC-04 | encontrada=" + encontrada.valor().titulo()
                + " | ausente=" + ausente.estaEncontrado());

        System.out.println("ESC-05 | antes de eliminar");
        int eliminadas = agenda.eliminarCanceladas();
        System.out.println("ESC-05 | eliminadas=" + eliminadas + " | restantes=" + agenda.size());
    }
}
