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

public enum JDBCConnection {

    MYSQL_hagric("jdbc:mysql://localhost:3306/hagric?serverTimezone=UTC",
            "root", "Kamczactiusz10!","com.mysql.cj.jdbc.Driver");

    private final String url;
    private final String user;
    private final String password;
    private final String driverClassName;


    JDBCConnection(String url, String user, String password, String driverClassName) {
        this.url = url;
        this.user = user;
        this.password = password;
        this.driverClassName = driverClassName;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

}
