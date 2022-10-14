package com.hari.learn.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Ajay");
        map.put(2, "Suresh");
        map.put(3, "hari");

        System.out.println(map);

        map.keySet();

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        System.out.println(integers);

        for (Integer integer :integers){
            System.out.println(integer * 10);
        }
    }
}
