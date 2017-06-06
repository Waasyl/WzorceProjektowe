package com.lukasz;

import java.util.function.Predicate;

/**
 * Created by RENT on 2017-06-06.
 */
public class UserPredicateFactory {
    public static Predicate<String> nameStartsWith(String prefix){
//        return new Predicate<String>(){
//            @Override
//            public boolean test(String s) {
//                return s.startsWith(prefix);
//            }
//        };
        return (e) -> e.startsWith(prefix);
    }

}
