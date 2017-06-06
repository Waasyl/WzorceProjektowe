package com.lukasz.mvc;

import com.lukasz.builder.User;

/**
 * Created by RENT on 2017-06-06.
 */
public class AboutController implements Controller {
    @Override
    public Object handle() {
        return new User("asd", "asfeg","asfge",234);
    }
}
