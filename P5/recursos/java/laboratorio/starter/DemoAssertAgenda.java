public class DemoAssertAgenda {
    public static void main(String[] args) {
        AgendaActividades agenda = new AgendaActividades();
        agenda.forzarCargaParaDiagnostico(0, -1);
        agenda.verificarInvariante();
        System.out.println("ASSERT-DESACTIVADO");
    }
}
