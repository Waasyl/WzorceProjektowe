package com.lukasz.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-06-02.
 */
public class Queue {
    private static Queue instance = null;

    public static Queue getInstance(){
        if(instance == null){
            instance = new Queue();
        }
        return instance;
    }

    private List<String> values;

    private Queue(){ values = new ArrayList<>(); }


    public void push(String value){
        values.add(value);
    }


    public String pop(){
        String valueToReturn = null;
        if(values.size() > 0){
            valueToReturn = values.remove(0);
        }
        return valueToReturn;
    }
}
