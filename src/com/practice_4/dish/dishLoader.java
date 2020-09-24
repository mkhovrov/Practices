package com.practice_4.dish;

public class dishLoader {

    public static void main(String[] args) {
        com.practice_4.dish.Plate a = new com.practice_4.dish.Plate("Ceramic", 0.7f, "Round", 8f, 1f);
        com.practice_4.dish.Fork b = new com.practice_4.dish.Fork("Steel", 0.1f, "Oblong", 4, 13f);
        com.practice_4.dish.Spoon c = new com.practice_4.dish.Spoon("Wood", 0.07f, "Oblong", 4f, 2f, 12f);

        System.out.println(a.forOutput());
        System.out.println(b.forOutput());
        System.out.println(c.forOutput());
    }
}
