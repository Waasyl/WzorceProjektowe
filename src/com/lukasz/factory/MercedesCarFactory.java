package com.lukasz.factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class MercedesCarFactory implements CarFactory {
    @Override
    public Car buildCar(String model) {
        Car car = null;
        if(model.equals("s600")){
            Engine engine = new Engine(300,3000,"gas");
            Wheels wheels = new Wheels(19,"winter");
            car = new Mercedes("s600",engine,wheels);
        }else if(model.equals("c200")){
            Engine engine = new Engine(184,3000,"petrol");
            Wheels wheels = new Wheels(17,"summer");
           car = new Mercedes("c200",engine,wheels);
        }
        return car;
    }
}
