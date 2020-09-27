/*
 * @ author : Emil Gajęcki
 * @ github: https://github.com/emilgajecki
 * @ linkedin : https://linkedin.com/in/emil-gajecki
 */

package pl.moj.obieg.modelfx;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pl.moj.obieg.database.dbutils.JDBCConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class SectionModel {

    private ObservableList<SectionFx> sectionList = FXCollections.observableArrayList();
    private ObjectProperty<SectionFx> section = new SimpleObjectProperty<>();

    public void init() throws SQLException {
        Connection connection = JDBCConnection.MYSQL_hagric.getConnection();

    }

    public ObservableList<SectionFx> getSectionList() {
        return sectionList;
    }

    public void setSectionList(ObservableList<SectionFx> sectionList) {
        this.sectionList = sectionList;
    }

    public SectionFx getSection() {
        return section.get();
    }

    public ObjectProperty<SectionFx> sectionProperty() {
        return section;
    }

    public void setSection(SectionFx section) {
        this.section.set(section);
    }

    public void saveSectionInDataBase(String name){

    }
}
