/*
 * @ author : Emil Gajęcki
 * @ github: https://github.com/emilgajecki
 * @ linkedin : https://linkedin.com/in/emil-gajecki
 */

package pl.moj.obieg.database.dbutils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

    public static void main(String[] args) throws SQLException {
        Connection connection = JDBCConnection.MYSQL_hagric.getConnection();
        Statement createTable = connection.createStatement();
        createTable.execute("drop table section;");
        boolean result = createTable.execute("create table section (" +
                "iddzialu integer primary key auto_increment," +
                "nazwa varchar (25));");
        System.out.println("Polecenie poprawnie wykonane ?"+!result);

        Statement insertRow = connection.createStatement();
        int count = insertRow.executeUpdate("insert into section values(1,'it')," +
                "(2,'biuro zarządu'),(3,'rodo'),(4,'kadry'),(5,'bydło i cielaki'),(6,'windykacja')," +
                "(7,'logistyka'),(8,'warsztat'),(9,'ksiegowosc'),(10, 'warsztat'),(11,'przedtawiciele')," +
                "(12,'trzoda');");
        System.out.println("Liczba wstawionych rekordów: " + count);
    }
}
