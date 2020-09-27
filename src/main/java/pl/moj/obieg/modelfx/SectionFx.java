/*
 * @ author : Emil Gajęcki
 * @ github: https://github.com/emilgajecki
 * @ linkedin : https://linkedin.com/in/emil-gajecki
 */

package pl.moj.obieg.modelfx;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SectionFx {

    //wypisanie propertisow
    private StringProperty IT = new SimpleStringProperty();
    private StringProperty RODO = new SimpleStringProperty();
    private StringProperty WARSZTAT = new SimpleStringProperty();

    public String getIT() {
        return IT.get();
    }

    public StringProperty ITProperty() {
        return IT;
    }

    public void setIT(String IT) {
        this.IT.set(IT);
    }

    public String getRODO() {
        return RODO.get();
    }

    public StringProperty RODOProperty() {
        return RODO;
    }

    public void setRODO(String RODO) {
        this.RODO.set(RODO);
    }

    public String getWARSZTAT() {
        return WARSZTAT.get();
    }

    public StringProperty WARSZTATProperty() {
        return WARSZTAT;
    }

    public void setWARSZTAT(String WARSZTAT) {
        this.WARSZTAT.set(WARSZTAT);
    }
}
