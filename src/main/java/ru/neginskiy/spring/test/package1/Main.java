package ru.neginskiy.spring.test.package1;

import ru.neginskiy.spring.test.package2.Class2;

public class Main {
    public static int a = 1;

    public static void hello() {
        System.out.println("Hello");
    }

    public void hello(int i) {
        System.out.println("Hello"+i);
    }

    public static void main(String[] args) {
        Main mainClass = new Main();
        System.out.println(mainClass.a);
        Main mainClass2 = new Class2();
        System.out.println(mainClass2.a);
        Class2 class2 = new Class2();
        //System.out.println(class2.a);
        Main class2main = new Class2();
        System.out.println(class2main.a);

        class E{
            String e = "Local class";
        }

    }

    static class B {
        String b= "Static Inner class";
    }

    class C{
        String c= "Inner class";
    }
}
class D{
    String d = "Local";
}

