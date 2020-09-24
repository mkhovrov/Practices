package com.practice_1;

import java.util.Scanner;

public class Factorial
{
    public static long factorial(long n)
    {
        if (n <= 0) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        System.out.println(factorial(number));
    }
}
