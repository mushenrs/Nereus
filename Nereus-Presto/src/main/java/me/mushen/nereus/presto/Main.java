package me.mushen.nereus.presto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @Desc
 * @Author Remilia
 * @Create 2017-07-11
 */
public class Main {

    public static void main(String[] args){
        String url = "jdbc:presto://localhost:8080/mysql/taofang?user=root&password=123456&SSL=true";
        Properties properties = new Properties();

        try(Connection connection = DriverManager.getConnection(url, properties)){

            System.out.println(connection.getSchema());

            Statement statement = connection.createStatement();
            System.out.println(statement);
            System.out.println(connection.getMetaData());
//            System.out.println(connection.createStatement().execute("select * from comment"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
