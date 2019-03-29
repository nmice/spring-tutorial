package ru.neginskiy.spring.test;

public class TestTypesConvert {

    public static void main(String[] args) {
        typeConverterExample();
        typeNarrowing();
    }

    public static void typeConverterExample() {
        long a = 100L;
        double b = 300.0;
        Object ab = a + b;
        System.out.println(ab.getClass().getName() + " value: " + ab); //java.lang.Double value: 400.0

        double c = 1000.05;
        long d = 1000;
        Object cd = c + d;
        System.out.println(cd.getClass().getName() + " value: " + cd);//java.lang.Double value: 2000.05
    }

    public static void typeNarrowing() {
        int a0 = 64;
        int a = 257;
        int a2 = 127;
        int a3 = 128;
        byte b0 = (byte) a0;
        byte b = (byte) a;
        byte b2 = (byte) a2;
        byte b3 = (byte) a3;
        System.out.println(b0 + " " + b + " " + b2 + " " + b3); //64 1 127 -128

        double c = 56.9876;
        int d = (int) c;
        System.out.println(d); //56

        long e = 1000L;
        float f = (float) e;
        System.out.println(f); //1000.0
    }
}
