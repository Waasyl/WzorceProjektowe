package com.lukasz.factory;

import java.util.List;

/**
 * Created by RENT on 2017-06-02.
 */
public class Audi implements Car{
    private Engine engine;
    private String model;

    private Wheels wheels;
    public Audi(String model, Engine engine, Wheels wheels) {
        this.model = model;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Override
    public void drive() {
        System.out.println("Driving with Audi " + model);
        System.out.println("Engine" + engine.toString());
        System.out.println("Wheels" + wheels.toString());
    }
}
