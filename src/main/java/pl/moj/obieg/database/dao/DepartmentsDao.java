/*
 * @ author : Emil Gajęcki
 * @ github: https://github.com/emilgajecki
 * @ linkedin : https://linkedin.com/in/emil-gajecki
 */

package pl.moj.obieg.database.dao;

import com.j256.ormlite.support.ConnectionSource;

public class DepartmentsDao extends CommonDao {

    public DepartmentsDao(ConnectionSource connectionSource){
        super (connectionSource);
    }
}
