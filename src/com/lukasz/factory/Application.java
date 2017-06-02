package com.lukasz.factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class Application {
    public static void main(String[] args) {
        AudiCarFactory audiCarFactory = new AudiCarFactory();
        Car car = audiCarFactory.buildCar("a3");


    }
}
