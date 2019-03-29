package ru.neginskiy.spring.test;

import java.util.ArrayList;
import java.util.List;

public class TestListHashCode {

    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list.hashCode());
        list.add("123");
        list.add("23");
        System.out.println(list.hashCode());

        List list2 = new ArrayList();
        System.out.println(list2.hashCode());
        list2.add("123");
        list2.add("23");
        System.out.println(list2.hashCode());

        System.out.println(list.equals(list2));
    }
}
