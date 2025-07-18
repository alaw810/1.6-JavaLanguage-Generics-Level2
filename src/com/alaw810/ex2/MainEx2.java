package com.alaw810.ex2;

public class MainEx2 {
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();

        Person p1 = new Person("Adrià", "Lorente", 32);
        Person p2 = new Person("Mai", "Costa", 40);

        System.out.println("-- Example 1: Mixed types --");
        gm.printAll(p1, "Barcelona", 42);

        System.out.println("\n-- Example 2: Only strings --");
        gm.printAll("Red", "Green", "Blue", "Yellow", "Purple", "Black");

        System.out.println("\n-- Example 3: Only integers --");
        gm.printAll(10, 20, 30);

        System.out.println("\n-- Example 4: Only Persona objects --");
        gm.printAll(p1, p2);
    }
}