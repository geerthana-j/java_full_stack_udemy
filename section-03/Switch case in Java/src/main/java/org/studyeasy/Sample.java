package org.studyeasy;

public class Sample {
    public static void main(String[] args) {
        String name = "Team";

        switch (name.toLowerCase()) {
            case "author" -> System.out.println("Chaand");
            case "team" -> System.out.println("chim and chan");
            case "editor" -> System.out.println("Jack and Jill");
            default -> System.out.println("Invalid entry");
        }

    }
}