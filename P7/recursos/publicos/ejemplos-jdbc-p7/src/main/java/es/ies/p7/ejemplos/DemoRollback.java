package es.ies.p7.ejemplos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoRollback {
    public static void main(String[] args) throws Exception {
        Path base = Path.of("target", "demo-rollback.db").toAbsolutePath();
        Files.createDirectories(base.getParent());
        String url = "jdbc:sqlite:" + base;
        preparar(url);

        try (var connection = DriverManager.getConnection(url)) {
            connection.setAutoCommit(false);
            try (var update = connection.prepareStatement("UPDATE saldo SET unidades = ? WHERE id = ?")) {
                update.setInt(1, 9); update.setString(2, "A"); update.executeUpdate();
                update.setInt(1, -1); update.setString(2, "B"); update.executeUpdate();
                connection.commit();
            } catch (SQLException ex) {
                connection.rollback();
                System.out.println("Rollback por: " + ex.getMessage());
            }
        }

        try (var connection = DriverManager.getConnection(url);
             var result = connection.createStatement().executeQuery("SELECT id, unidades FROM saldo ORDER BY id")) {
            while (result.next()) System.out.printf("%s=%d%n", result.getString(1), result.getInt(2));
        }
    }

    private static void preparar(String url) throws SQLException {
        try (var connection = DriverManager.getConnection(url);
             var statement = connection.createStatement()) {
            statement.executeUpdate("DROP TABLE IF EXISTS saldo");
            statement.executeUpdate("CREATE TABLE saldo(id TEXT PRIMARY KEY, unidades INTEGER CHECK(unidades >= 0))");
            statement.executeUpdate("INSERT INTO saldo VALUES ('A', 3), ('B', 4)");
        }
    }
}
