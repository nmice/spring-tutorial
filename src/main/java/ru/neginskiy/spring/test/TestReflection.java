package ru.neginskiy.spring.test;

import java.lang.reflect.Field;

public class TestReflection {
    private String name = "SomeNameString";
    private Integer x = 25;

}

class TestPrivateAccess {

    public static void main(String[] args) {
        TestReflection testReflection = new TestReflection();

        try {
            Field reflectField = TestReflection.class.getDeclaredField("name"); //NoSuchFieldException e
            Field reflectField2 = TestReflection.class.getDeclaredField("x"); //NoSuchFieldException e

            /* Если не дать доступ, то будет ошибка
            java.lang.IllegalAccessException: Class .. .TestPrivateAccess
            can not access a member of class .. .SomeClass with modifiers "private"
            */
            reflectField.setAccessible(true);
            reflectField2.setAccessible(true);

            String fieldValue = (String) reflectField.get(testReflection); //IllegalAccessException ex
            Integer fieldValue2 = (Integer) reflectField2.get(testReflection); //IllegalAccessException ex
            System.out.println(reflectField);//private java.lang.String ru.javastudy.interview.oop.privateFieldAccess.SomeClass.name
            System.out.println(fieldValue); //SomeNameString

            System.out.println(reflectField2);//private java.lang.Integer ru.javastudy.interview.oop.privateFieldAccess.SomeClass.x
            System.out.println(fieldValue2); //25
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }
    }
}
