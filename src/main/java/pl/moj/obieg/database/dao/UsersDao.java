/*
 * @ author : Emil Gajęcki
 * @ github: https://github.com/emilgajecki
 * @ linkedin : https://linkedin.com/in/emil-gajecki
 */

package pl.moj.obieg.database.dao;

import com.j256.ormlite.support.ConnectionSource;

public class UsersDao extends CommonDao {

    public UsersDao(ConnectionSource connectionSource){
        super (connectionSource);
    }
}
