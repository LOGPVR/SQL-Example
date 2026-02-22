package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Ivan", "Ivanov", (byte) 18);
        userService.saveUser("Sidor", "Sidorov", (byte) 45);
        userService.saveUser("Pavel", "Pavlov", (byte) 33);
        userService.saveUser("Vasily", "Vasiliev", (byte) 26);

        List<User> userList = userService.getAllUsers();
        System.out.println(userList);

        userService.removeUserById(2);
        List<User> userList1 = userService.getAllUsers();
        System.out.println("После метода removeUserById:\n" + userList1);

        userService.cleanUsersTable();

        userService.dropUsersTable();


    }
}
