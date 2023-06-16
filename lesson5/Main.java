package lesson5;

import java.util.Scanner;

import lesson5.controller.UserController;

public class Main {
    public static void main(String[] args) {

        UserController userController = new UserController();
        Scanner scanner = new Scanner(System.in);
        userController.saveUser(scanner.nextLine(), scanner.nextLine(), scanner.nextLong());
        Scanner scanner1 = new Scanner(System.in);
        userController.saveUser(scanner1.nextLine(), scanner1.nextLine(), scanner1.nextLong());
        userController.deleteUser(0);
        userController.getAllUsers();
    }
}
