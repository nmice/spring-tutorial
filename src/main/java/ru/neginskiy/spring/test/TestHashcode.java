package ru.neginskiy.spring.test;

import java.util.ArrayList;
import java.util.List;

public class TestHashcode {

    public static void main(String[] args) {
        Object list1 = new Object();
        Object list2 = new Object();
        Object list3 = new Object();
        Object list4 = new Object();
        System.out.println(list1.hashCode());
        System.out.println(list2.hashCode());
        System.out.println(list3.hashCode());
        System.out.println(list4.hashCode());
    }
}
