package com.lukasz.mvc;

import com.lukasz.builder.User;

/**
 * Created by RENT on 2017-06-06.
 */
public class HomeController implements Controller {

    @Override
    public Object handle() {
        return new User("Lukasz", "Was", "34257543456",21);
    }

}
