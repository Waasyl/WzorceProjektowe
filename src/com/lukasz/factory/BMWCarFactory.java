package com.lukasz.factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class BMWCarFactory implements CarFactory{
    @Override
    public Car buildCar(String model) {
        Car car = null;
        if(model.equals("x5")){
            Engine engine = new Engine(180,2000,"diesel");
            Wheels wheels = new Wheels(17,"winter");
            car = new BMW("x5",engine,wheels);
        }else if(model.equals("m3")){
            Engine engine = new Engine(250,3000,"gas");
            Wheels wheels = new Wheels(24,"summer");
            car = new BMW("c200",engine,wheels);
        }
        return car;
    }
}
