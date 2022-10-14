package com.hari.learn.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorVsForLoop {
    public static void main(String[] args) {

        //List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 45, 9, 10, 100);
        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            integerList.add(i * i);
        }

        /*for (Integer integer : integerList) {
            if (integer == 100) {
                integerList.add(110);
            }
        }*/
        //integerList.remove(new Integer(81));

        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == 100) {
                iterator.remove();
            }
        }

        System.out.println(integerList);
    }
}
