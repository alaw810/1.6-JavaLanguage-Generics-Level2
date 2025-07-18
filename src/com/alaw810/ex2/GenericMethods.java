package com.alaw810.ex2;

public class GenericMethods {

    public <T> void printAll(T... args) {
        for (T arg : args) {
            System.out.println(arg);
        }
    }
}