package dao;

import com.srez.pojo.Users;

/**
 * Created by set on 15.05.17.
 */
public interface UsersDao {

    Users findUserByLoginAndPassword(String login, String password);
}
