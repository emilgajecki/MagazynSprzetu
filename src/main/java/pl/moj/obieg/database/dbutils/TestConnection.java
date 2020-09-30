/*
 * @ author : Emil Gajęcki
 * @ github: https://github.com/emilgajecki
 * @ linkedin : https://linkedin.com/in/emil-gajecki
 */

package pl.moj.obieg.database.dbutils;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

    public static void main(String[] args)

        //obstawiliśmy błędy przy podłaczeniu do bazy
            throws ClassNotFoundException,
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getConstructor().newInstance();
                Connection connection = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-E4M08VH\\SQLEXPRESS;database=Hagric",
                        "emil","Kamczactiusz10!");
            }
}
