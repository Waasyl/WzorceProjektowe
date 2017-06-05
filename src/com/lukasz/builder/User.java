package com.lukasz.builder;

import lombok.*;

/**
 * Created by RENT on 2017-06-05.
 */
@Builder
@Data
@AllArgsConstructor
public class User {
//    @Getter(AccessLevel.PRIVATE)
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int age;


}
