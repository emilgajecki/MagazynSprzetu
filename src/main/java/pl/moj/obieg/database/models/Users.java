/*
 * @ author : Emil Gajęcki
 * @ github: https://github.com/emilgajecki
 * @ linkedin : https://linkedin.com/in/emil-gajecki
 */

package pl.moj.obieg.database.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "users")
public class Users implements BaseModel{

    public Users(){

    }

    @DatabaseField(generatedId = true)
    private int iduser;

    @DatabaseField(columnName = "name", canBeNull = false)
    private String nameUsers;

    @DatabaseField(columnName = "lastname", canBeNull = false)
    private String lastNameUsers;

    @DatabaseField(columnName = "iddzialu",canBeNull = false)
    private int idDzialu;

    @DatabaseField(columnName = "active", canBeNull = false)
    private int activeUsers;

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getNameUsers() {
        return nameUsers;
    }

    public void setNameUsers(String nameUsers) {
        this.nameUsers = nameUsers;
    }

    public String getLastNameUsers() {
        return lastNameUsers;
    }

    public void setLastNameUsers(String lastNameUsers) {
        this.lastNameUsers = lastNameUsers;
    }

    public int getIdDzialu() {
        return idDzialu;
    }

    public void setIdDzialu(int idDzialu) {
        this.idDzialu = idDzialu;
    }

    public int getActiveUsers() {
        return activeUsers;
    }

    public void setActiveUsers(int activeUsers) {
        this.activeUsers = activeUsers;
    }
}
