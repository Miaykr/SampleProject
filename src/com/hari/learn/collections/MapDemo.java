package com.hari.learn.collections;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Map<String, String> stringStringMap = new HashMap<>();

        map.put(1, "Ajay");
        map.put(2, "Suresh");
        map.put(3, "hari");
        map.put(3, "Ivan");
        map.put(null, "Ishaan");
        map.put(null, "Suresh");
        map.put(6, null);
        map.put(7, null);
        map.put(8, null);
        map.put(9, null);
        System.out.println(map);

        Collection<String> values = map.values();

        Set<Integer> integers = map.keySet();

        values.forEach(System.out::println);

        System.out.println(map.containsKey(3));

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key:" + entry.getKey() + ", Value: " + entry.getValue());
        }

        /*map.keySet();

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        System.out.println(integers);

        for (Integer integer :integers){
            System.out.println(integer * 10);
        }*/
    }
}
