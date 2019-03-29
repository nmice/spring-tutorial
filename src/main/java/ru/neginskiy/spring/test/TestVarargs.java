package ru.neginskiy.spring.test;

public class TestVarargs {

    public static void main(String[] args) {
        printArgs("first");
        printArgs("first","second");
        printArgs("first","second","third");


    }

    static void printArgs(String... strings){
        for (String s: strings){
            System.out.print(s+" ");
        }
        System.out.println();
    }

}
