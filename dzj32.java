
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class domashka {
    private static void createTableEx() throws SQLException {

        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS goodsTable (\n" +
                "    id    INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "    prodid  TEXT UNIQUE,\n" +
                "    title TEXT,\n" +
                "    cost INTEGER\n" +
                ");");
    }

    private static void batchEx() throws SQLException {
        connection.setAutoCommit(false);
        long t = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            stmt.addBatch("INSERT INTO goodsTable (prodid, title, cost) VALUES (" + i + ", 'car', 100);");
        }
        stmt.executeBatch();
        connection.setAutoCommit(true);
        System.out.println(System.currentTimeMillis() - t);
    }

    private static void selectEx() throws SQLException {
        System.out.println("ищем");
        Scanner scanner = new Scanner(System.in);
        String res = scanner.nextLine();
        String sql = String.format("SELECT cost FROM goodsTable where prodid = '%s';", res);
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getString("cost"));
        }
    }
}
    private static void clearTableEx() throws SQLException {
        stmt.executeUpdate("DELETE FROM goodsTable;");
    }
