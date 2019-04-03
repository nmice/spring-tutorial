package ru.neginskiy.spring.test;

public class TestObject {

    public static void main(String[] args) {
        Object o = new Object();

        Class clazz = o.getClass();

        System.out.println(clazz);

    }
}
