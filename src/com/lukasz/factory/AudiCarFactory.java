package com.lukasz.factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class AudiCarFactory implements CarFactory {

    @Override
    public Car buildCar(String model) {
        Car car = null;
        if(model.equals("a3")){
            Engine engine = new Engine(200, 3000, "diesel");
            Wheels wheels = new Wheels(18, "summer");
            car= new Audi("a3",engine, wheels);
        }else if(model.equals("tt")){
            Engine engine = new Engine(120, 2000, "gas");
            Wheels wheels = new Wheels(18, "summer");
            car = new Audi("tt",engine, wheels);
        }else if(model.equals("s3")){
            Engine engine = new Engine(360, 5000, "gas");
            Wheels wheels = new Wheels(18, "summer");
            car = new Audi("s3",engine, wheels);
        }
        return car;
    }
}
