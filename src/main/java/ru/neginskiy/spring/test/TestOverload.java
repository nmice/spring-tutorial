package ru.neginskiy.spring.test;

public class TestOverload {
    public static void main(String[] args) {
        byte a=22;
        test1("1",22);
        test1(a,"22");
        test1(2147483647,"22");
    }

    static void test1(String s, int i){
        System.out.println("String, int");
    }

    static void test1(byte i, String s){
        System.out.println("byte, String");
    }

    static void test1(short i, String s){
        System.out.println("short, String");
    }

    static void test1(int i, String s){
        System.out.println("int, String");
    }

    static void test1(long i, String s){
        System.out.println("long, String");
    }
}
