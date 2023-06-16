package lesson5.controller;

import lesson5.service.UserService;
import lesson5.service.UserServiceImpl;

public class UserController {
    private UserService userService = new UserServiceImpl();

    public void saveUser(String name, String lastName, long amount) {
        System.out.println("Enter your data");
        userService.saveUser(name, lastName, amount);
    }

    public void deleteUser(int index) {
        if (index != -1) {

            userService.deleteUser(index);
            System.out.println("Delete has been performed");
        } else {
            System.out.println("User is null!");
        }
    }

    public void getAllUsers() {
        System.out.println(userService.getAllUsers());
    }
}
