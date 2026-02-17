package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {
        String sql = "CREATE TABLE IF NOT EXISTS students(" +
                "id BIGINT PRIMARY KEY AUTO_INCREMENT," +
                "name VARCHAR(35)," +
                "last_name VARCHAR(65)," +
                "age TINYINT UNSIGNED)";

        try(Connection connection = Util.getConnect()) {
            Statement statement = connection.createStatement();
            statement.execute(sql);
            System.out.println("The students table was created successfully!");
        } catch (SQLException e) {
            System.out.println("Error creating table students:\n" + e.getMessage());
        }
    }

    public void dropUsersTable() {

    }

    public void saveUser(String name, String lastName, byte age) {

    }

    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() {
        return null;
    }

    public void cleanUsersTable() {

    }
}
