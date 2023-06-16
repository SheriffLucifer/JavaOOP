package lesson5.service;

import java.util.List;

import lesson5.model.User;

public interface UserService {
    void saveUser(String name, String lastName, long moneyAmount);

    void deleteUser(int index);

    List<User> getAllUsers();
}
