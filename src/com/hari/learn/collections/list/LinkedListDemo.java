package com.hari.learn.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> stringList = new LinkedList<>();
        stringList.add("Suresh");
        stringList.add("Durga");
        List<String> subLinkedList = new LinkedList<>();
        subLinkedList.add("Hari");
        subLinkedList.add("Ajay");

        stringList.addAll(0, subLinkedList);

        System.out.println(stringList);
    }
}
