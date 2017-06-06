package com.lukasz.mvc;

/**
 * Created by RENT on 2017-06-06.
 */
public class Application {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.handle("about json");
        frontController.handle("home json");
        frontController.handle("home html");

    }
}
