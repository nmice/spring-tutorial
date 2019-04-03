package ru.neginskiy.spring.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TestList {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(3);
        String s = list.get(0).getClass().getSimpleName();
        System.out.println(s);
        Stack stack = new Stack();
    }
}
