/*
 * @ author : Emil Gajęcki
 * @ github: https://github.com/emilgajecki
 * @ linkedin : https://linkedin.com/in/emil-gajecki
 */

package pl.moj.obieg.database.dbutils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StoreApp {

    public static void main(String[] args) throws SQLException {

        // odpowiada za połączenie z bazą danych
        Connection connection = JdbcSQLServerConnection.MSSQL_HAGRIC.getConnection();

        //Statement - to jest interfejs
        Statement createTable = connection.createStatement();

        //createTable.execute("drop table kursanci;");
        boolean result = createTable.execute("create table users (id_dzialu  integer primary key," +
                " name_departments varchar(25));");
        System.out.println("Polecenie poprawnie wykonane ?" + result);

        // wstawiamy dane w tablei
        Statement insertRow = connection.createStatement();
        int count = insertRow.executeUpdate("insert into departments values(1,'it')," +
                "(2,'biuro zarządu'),(3,'rodo'),(4,'kadry'),(5,'bydło i cielaki')," +
                "(6,'windykacja'),(7,'logistyka'),(8,'warsztat'),(9,'ksiegowosc')," +
                "(10,'przedtawiciele'),(11,'trzoda');");
        System.out.println("Liczba wstawionych rekordów: " + count);
    }
}