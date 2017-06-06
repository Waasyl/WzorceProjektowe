package com.lukasz.mvc;

import com.lukasz.builder.User;

/**
 * Created by RENT on 2017-06-06.
 */
public class JsonView implements View<User>{

    @Override
    public String home(User model) {
        return new StringBuilder()
                .append("{\n")
                .append("\tfirstName: \"" + model.getFirstName() + "\",\n")
                .append("\tlastName: \"" + model.getLastName() + "\",\n")
                .append("\tphoneNumber: \"" + model.getFirstName() + "\",\n")
                .append("\tage: " + model.getAge() + "\n")
                .append("}").toString();

    }

}
