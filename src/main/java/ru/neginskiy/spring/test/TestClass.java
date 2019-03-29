package ru.neginskiy.spring.test;

public class TestClass {

    int a;
    double b;
    float c;
    char d;
    String s;
    Object o;
    boolean e;

    @Override
    public String toString() {
        return "TestClass{" +
                "int=" + a + ", double=" + b + ", float=" + c + ", char=" + d + ", String='" + s + '\'' + ", Object=" + o + ", boolean=" + e + '}';
    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        System.out.println(testClass); //TestClass{a=0, b=0.0, c=0.0, d= , s='null', o=null, e=false}
    }
}
