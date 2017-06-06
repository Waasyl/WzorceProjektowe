package com.lukasz.mvc;

/**
 * Created by RENT on 2017-06-06.
 */
public interface View<T> {
    String home(T model);
}
