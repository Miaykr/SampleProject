package com.hari.learn.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(new Integer(4));
        list.remove(1);

        list.add(2);
        list.add(4);

        List<Integer> subList = list.subList(2, 4);

        boolean contains = list.contains(new Integer(5));

        boolean containsAll = list.containsAll(subList);

        System.out.println(containsAll);


        System.out.println(contains);

        System.out.println(subList);

        for (Integer integer : list) {
            //list.remove(integer);
            System.out.println(integer);
        }

        System.out.println(list);

        long end = System.currentTimeMillis();

        System.out.println(end - start);

        //Internal DS = Array, means
    }
}
