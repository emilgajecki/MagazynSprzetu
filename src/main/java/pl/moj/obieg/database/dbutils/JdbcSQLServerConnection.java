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

public enum JdbcSQLServerConnection {

    MSSQL_HAGRIC("jdbc:sqlserver://DESKTOP-E4M08VH\\SQLEXPRESS;database=Hagric",
            "emil", "Kamczactiusz10!","com.microsoft.sqlserver.jdbc.SQLServerDriver");

    private String dbURL = "jdbc:sqlserver://DESKTOP-E4M08VH\\SQLEXPRESS;database=Hagric";
    private String user = "emil";
    private String pass = "";
    private String driverClassName;

    JdbcSQLServerConnection(String dbURL, String user, String pass, String driverClassName) {
        this.dbURL = dbURL;
        this.user = user;
        this.pass = pass;
        this.driverClassName = driverClassName;
        try {
            Class.forName(driverClassName).getConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbURL, user, pass);
    }
}
