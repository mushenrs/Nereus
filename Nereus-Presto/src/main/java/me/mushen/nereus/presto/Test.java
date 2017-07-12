package me.mushen.nereus.presto;

import java.sql.*;

/**
 * @Desc
 * @Author Remilia
 * @Create 2017-07-11
 */
public class Test {

    public static void main(String[] args) throws SQLException {
        String sql = "SELECT * FROM sys.node";
        String url = "jdbc:presto://localhost:8080/catalog/schema?SSL=true";
        try (Connection connection =
                     DriverManager.getConnection(url, "test", "123456")) {
            try (Statement statement = connection.createStatement()) {
                try (ResultSet rs = statement.executeQuery(sql)) {
                    while (rs.next()) {
                        System.out.println(rs.getString("node_id"));
                    }
                }
            }
        }
    }
}
