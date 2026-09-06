package es.ies.p7.ejemplos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.DriverManager;

public class DemoPreparedStatement {
    public static void main(String[] args) throws Exception {
        Path base = Path.of("target", "demo-parametros.db").toAbsolutePath();
        Files.createDirectories(base.getParent());
        String url = "jdbc:sqlite:" + base;

        try (var connection = DriverManager.getConnection(url);
             var statement = connection.createStatement()) {
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS nota(id TEXT PRIMARY KEY, texto TEXT NOT NULL)");
        }

        try (var connection = DriverManager.getConnection(url);
             var insert = connection.prepareStatement("INSERT OR REPLACE INTO nota(id, texto) VALUES (?, ?)")) {
            insert.setString(1, "N1");
            insert.setString(2, "O'Brien: los datos no son SQL");
            System.out.println("Filas insertadas: " + insert.executeUpdate());
        }

        try (var connection = DriverManager.getConnection(url);
             var query = connection.prepareStatement("SELECT texto FROM nota WHERE id = ?")) {
            query.setString(1, "N1");
            try (var result = query.executeQuery()) {
                System.out.println(result.next() ? result.getString("texto") : "Sin fila");
            }
        }
    }
}
