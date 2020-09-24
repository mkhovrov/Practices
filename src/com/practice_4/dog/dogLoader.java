package com.practice_4.dog;

public class dogLoader {
    public static void main(String[] args) {
        JackRusselTerrier JRT = new JackRusselTerrier(5f, 30f, 5, "short", "rodents");
        Poodle poodle = new Poodle(6f, 51f, 8, "long", "decorative");

        System.out.println(JRT.displayInfo());
        System.out.println(poodle.displayInfo());
    }
}
