package com.alaw810.ex1;

public class MainEx1 {
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        Person person = new Person("Adrià", "Lorente", 32);

        gm.printAll("Hello", person, 123);
        gm.printAll("Fixed String", 3.14, true);
    }
}
