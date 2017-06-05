package com.lukasz.dao;

import com.lukasz.builder.User;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-06-05.
 */
public class UserDaoInMemory implements UserDao {
    private List<User> users;

    public UserDaoInMemory() {
        users = new ArrayList<>();
        users.add(User.builder()
                .firstName("Lukasz")
                .lastName("Was")
                .age(21)
                .phoneNumber("123456789")
                .build());
        users.add(User.builder()
                .firstName("Anna")
                .lastName("Kowalska")
                .age(45)
                .phoneNumber("0875372678")
                .build());
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
