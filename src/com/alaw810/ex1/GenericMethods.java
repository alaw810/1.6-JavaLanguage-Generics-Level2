package com.alaw810.ex1;

public class GenericMethods {

    public <T, U> void printAll(String fixedArg, T arg2, U arg3) {
        System.out.println("Fixed argument (String): " + fixedArg);
        System.out.println("Second argument: " + arg2);
        System.out.println("Third argument: " + arg3);
    }
}
