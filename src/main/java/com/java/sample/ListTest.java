package com.java.sample;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("test1");
        list.add("test3");
        System.out.println(list.toString());

        ArrayList<String> list2 = (ArrayList<String>) list.clone();

        list2.remove(0);

        System.out.println(list.hashCode() + ":" + list2.hashCode());
        System.out.println(list + ":" + list2);
    }
}
