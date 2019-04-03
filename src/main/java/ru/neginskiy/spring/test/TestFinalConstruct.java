package ru.neginskiy.spring.test;

import java.io.IOException;
import java.sql.SQLException;

public class TestFinalConstruct {
    public TestFinalConstruct() {
    }

    public static void main(String[] args) {
        try {
            int x = 2;
            if (x > 2) {
                throw new IOException();
            }
            throw new SQLException();
        } catch (IOException | SQLException ex) {
            System.out.println("MULTIPLE EXCEPTION");
        }
    }

    private void method()throws Exception{
        System.out.println("oops");
        throw new Exception();
    }
}
