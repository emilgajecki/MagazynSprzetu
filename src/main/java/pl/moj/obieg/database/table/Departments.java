/*
 * @ author : Emil Gajęcki
 * @ github: https://github.com/emilgajecki
 * @ linkedin : https://linkedin.com/in/emil-gajecki
 */

package pl.moj.obieg.database.table;

public class Departments {


    private long idDepartments;
    private String nameDepartments;

    public long getIdDepartments() {
        return idDepartments;
    }

    public void setIdDepartments(long idDepartments) {
        this.idDepartments = idDepartments;
    }

    public String getNameDepartments() {
        return nameDepartments;
    }

    public void setNameDepartments(String nameDepartments) {
        this.nameDepartments = nameDepartments;
    }

    @Override
    public String toString() {
        return "Departments{" +
                "idDepartments=" + idDepartments +
                ", nameDepartments='" + nameDepartments + '\'' +
                '}';
    }
}
