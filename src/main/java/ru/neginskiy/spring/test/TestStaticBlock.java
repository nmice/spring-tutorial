package ru.neginskiy.spring.test;

public class TestStaticBlock {
    static {
        int i=2;
        System.out.println(1/(2-i));
    }

    public static void main(String[] args) {
        System.err.println("Oops");
    }
}
