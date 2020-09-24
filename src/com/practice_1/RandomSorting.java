package com.practice_1;

public class RandomSorting
{
    public static void main(String[] args)
    {
        int[]randArr = new int[10];

        for (int i = 0; i < 10; i++)
        {
            int decV = (int)(Math.pow(10, Math.random() * 10));
            double Value = Math.random();
            randArr[i] = (int)(Value*decV);
        }

        for(int i = 0; i < 10; i++)
        {
            System.out.print(randArr[i]);
            System.out.print(" ");
        }

        for (int i = 0; i < 10; i++)
        {
            for (int k = 1; k < 10; k++)
            {
                if (randArr[k - 1] > randArr[k])
                {
                    int Hold = randArr[k - 1];
                    randArr[k - 1] = randArr[k];
                    randArr[k] = Hold;
                }

            }
        }
        System.out.println();

        for(int i = 0; i < 10; i++)
        {
            System.out.print(randArr[i]);
            System.out.print(" ");
        }
    }
}
