/*
 * @ author : Emil Gajęcki
 * @ github: https://github.com/emilgajecki
 * @ linkedin : https://linkedin.com/in/emil-gajecki
 */

package pl.moj.obieg.database.dbutils;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBUtils {

    static Scanner scanner = new Scanner(System.in);

    static int menu() {
        System.out.print("1. Zobacz co mamy w tabeli ");
        System.out.print("0. Koniec ");
        while (!scanner.hasNextInt()) {
            System.out.println("Wpisz nr polecenia z menu!!!");
            scanner.nextLine();
        }
        // scaner czyta wszystko z inta - enter zostawał wiec jest blad
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }


        public static void main (String[]args) throws SQLException {

            Connection connection = JDBCConnection.MYSQL_hagric.getConnection();
            while (true) {
                final int option = menu();
                switch (option) {
                    case 1:
                        showRowsFromSectionTable(connection);
                        break;
                }
            }
        }

    //pobranie danych z tabeli section
    static void showRowsFromSectionTable(Connection connection) throws SQLException {
        Statement select = connection.createStatement();
        ResultSet set = select.executeQuery("select * from hagric.section");
        //set w tej petki to nasz przegladany wiersz
        while (set.next()) {
            //pobranie kolumny z nazwa kolumny
            //konwersja typu bazodanowego na java
            // w bazie danych jest varchar a w javie odpowiada to Sting
            int id = set.getInt("iddzialu");
            String name = set.getString("nazwa");
            System.out.println(id + " " + name);
        }
        set.close();
        select.close();
    }
}
