package com.lukasz.builder;

/**
 * Created by RENT on 2017-06-05.
 */
public class Application {
    public static void main(String[] args) {
        User user = User.builder()
                .firstName("Lukasz")
                .lastName("Was")
                .age(21)
                .phoneNumber("123445678")
                .zipCode("60-002")
                .build();

        System.out.println(user);
    }
}
