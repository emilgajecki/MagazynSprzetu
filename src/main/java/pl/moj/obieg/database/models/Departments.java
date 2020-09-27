/*
 * @ author : Emil Gajęcki
 * @ github: https://github.com/emilgajecki
 * @ linkedin : https://linkedin.com/in/emil-gajecki
 */

package pl.moj.obieg.database.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "department")
public class Departments implements BaseModel {


    // kalsy modelowane na tabele w bazie danych
    public Departments(){

    }
    @DatabaseField(generatedId = true)
    private int iddzialu;

    @DatabaseField(columnName = "nazwa", canBeNull = false)
    private String nazaDzialu;

    public int getIddzialu() {
        return iddzialu;
    }

    public void setIddzialu(int iddzialu) {
        this.iddzialu = iddzialu;
    }

    public String getNazaDzialu() {
        return nazaDzialu;
    }

    public void setNazaDzialu(String nazaDzialu) {
        this.nazaDzialu = nazaDzialu;
    }
}
