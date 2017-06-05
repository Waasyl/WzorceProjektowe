package com.lukasz.builder;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

/**
 * Created by RENT on 2017-06-05.
 */
@Builder
@Data

public class User {
    @Getter(AccessLevel.PRIVATE)
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int age;
    private String zipCode;


}
