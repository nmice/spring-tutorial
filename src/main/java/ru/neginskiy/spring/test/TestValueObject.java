package ru.neginskiy.spring.test;

public class TestValueObject {

    public static void main(String[] args) {
        //Object
        Dog myDog = new Dog("Rover");
        foo(myDog);
        System.out.println(myDog.getName());

        //int
        int x = 5;
        int y = -changeX(x);
        System.out.println("x = " + x + ", y = "+ y);
    }

    public static void foo(Dog someDog) {
        someDog.setName("Max");     // AAA
        someDog = new Dog("Fifi");  // BBB
        someDog.setName("Rowlf");   // CCC
    }

    private static int changeX(int value) {
        value = value * 5;
        return value;
    }

    static class Dog {
        private String name;

        public Dog(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}


