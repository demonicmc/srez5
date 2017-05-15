package dao;

import com.srez.pojo.Users;
import org.postgresql.jdbc2.optional.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by set on 15.05.17.
 */
public class UsersDaoImpl implements UsersDao {

    @Override
    public Users findUserByLoginAndPassword(String login, String password) {
        Users user = null;
//
//        try (Connection connection = ConnectionPool.getInstance().getConnection();
//             PreparedStatement statement = connection
//                     .prepareStatement( "SELECT * FROM user_st WHERE login = ? AND password = ?")) {
//
//            statement.setString(1, login);
//            statement.setString(2, password);
//            ResultSet resultSet = statement.executeQuery();
//            if (resultSet.next()) {
//                user = createEntity(resultSet);
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        return user;
    }

    private Users createEntity(ResultSet resultSet) throws SQLException {
        return new Users(resultSet.getLong("id"),
                resultSet.getString("login"),
                resultSet.getString("password"));
    }
}
