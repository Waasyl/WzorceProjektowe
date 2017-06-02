package com.lukasz.factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class Mercedes implements Car {
    private Engine engine;
    private String model;

    private Wheels wheels;
    public Mercedes(String model, Engine engine, Wheels wheels) {
        this.model = model;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Override
    public void drive() {
        System.out.println("Driving with Mercedes " + model);
        System.out.println("Engine" + engine.toString());
        System.out.println("Wheels" + wheels.toString());
    }
}
