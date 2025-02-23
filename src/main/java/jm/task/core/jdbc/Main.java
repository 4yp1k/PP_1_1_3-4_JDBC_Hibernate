package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Name11", "LastName1", (byte) 20);
        userService.saveUser("Name22", "LastName2", (byte) 25);
        userService.saveUser("Name33", "LastName3", (byte) 31);
        userService.saveUser("Name44", "LastName4", (byte) 38);

        userService.removeUserById(1);

        List<User> userList = userService.getAllUsers();
        System.out.println(userList);

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
