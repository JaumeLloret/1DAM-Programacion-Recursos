package es.ies.p5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AgendaTest {
    @Test
    void aceptaCodigoValido() throws CodigoInvalidoException {
        Agenda agenda = new Agenda();
        agenda.añadir(new Registro<>("P5-AA-26", "Datos"));
        assertEquals(1, agenda.cantidad());
    }

    @Test
    void rechazaCodigoInvalidoAunqueAssertEsteDesactivado() {
        Agenda agenda = new Agenda();
        assertThrows(CodigoInvalidoException.class,
                () -> agenda.añadir(new Registro<>("incorrecto", "Datos")));
    }
}
