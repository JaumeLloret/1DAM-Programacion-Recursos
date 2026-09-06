package es.ies.p5;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class Agenda {
    private static final Pattern CODIGO = Pattern.compile("P5-[A-Z]{2}-\\d{2}");
    private final List<Registro<String>> registros = new ArrayList<>();

    public void añadir(Registro<String> registro) throws CodigoInvalidoException {
        if (!CODIGO.matcher(registro.codigo()).matches()) {
            throw new CodigoInvalidoException(registro.codigo());
        }
        registros.add(registro);
        assert registros.size() > 0 : "alta sin registro";
    }

    public long cantidad() { return registros.stream().count(); }
}
