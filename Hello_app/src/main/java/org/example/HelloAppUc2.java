package org.example;

public class HelloAppUc2 {


    public static void main(String[] args) {

        // Default name
        String name = "World";

        // Check if user provided a command-line argument
        if (args.length > 0) {
            name = args[0];
        }

        // Print greeting
        System.out.println("Hello, " + name + "!");
    }
}
