package ru.neginskiy.spring.test.package2;

import ru.neginskiy.spring.test.package1.Main;

public class Class2 extends Main {
    //public static int a = 2;

    public static String hello(int i) {
        System.out.println("HelloClass2"+i);
        return "";
    }

    public static void main(String[] args) {
/*        Main main = new Main();
        //System.out.println(main.a);
        Main mainClass2 = new Class2();
        //System.out.println(mainClass2.a);
        Class2 class2 = new Class2();
        System.out.println(class2.a);*/
        Main.hello();
        Class2.hello();
        Class2.hello(123);
        System.out.println(Class2.a);
    }
}

