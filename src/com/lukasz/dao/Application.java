package com.lukasz.dao;

import com.lukasz.builder.User;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

/**
 * Created by RENT on 2017-06-05.
 */
public class Application {

    private static final String PATH = "C:\\Users\\RENT\\IdeaProjects\\DesignPatterns\\users";
    public static void main(String[] args) {

    UserDao userDao = new UserDaoInFile(new File(PATH));
    userDao.addUser(User.builder()
            .firstName("Adam")
            .lastName("Malysz")
            .age(40)
            .phoneNumber("12342314553")
            .build());

        List<User> allUsers = userDao.getAllUsers();
        allUsers.forEach(e -> System.out.println(e));
//        allUsers.forEach(System.out::println);

    }

}
