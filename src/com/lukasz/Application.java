package com.lukasz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 * Created by RENT on 2017-06-02.
 */
public class Application {
    public static void main(String[] args) {
        System.out.println("Hello world");

    List<List<String>> nameList = Arrays.asList(
            Arrays.asList("Szymon","Wojciech","Adam","Tomasz"),
            Arrays.asList("Anna","Janina","Malgorzata"));

    nameList.stream()
            .flatMap(e -> e.stream())
            .filter(UserPredicateFactory.nameStartsWith("A"))
            .forEach(e -> System.out.println(e));

    Map<String, List<String>> map = new HashMap<>();
    map.put("men",Arrays.asList("Szymon","Wojciech","Adam","Tomasz"));
    map.put("women",Arrays.asList("Anna","Janina","Malgorzata"));

    map.entrySet()
            .stream()
            .flatMap(e -> e.getValue().stream())
//            All the filter methods below make exactly same thing, those with lambda are newer.
            .filter(new Predicate<String>(){
                @Override
                public boolean test(String s) {
                    return s.startsWith("A");
                }
            })
            .filter(e -> e.startsWith("A"))
            .filter(UserPredicateFactory.nameStartsWith("A"))
            .forEach(e -> System.out.println(e));

}
}
