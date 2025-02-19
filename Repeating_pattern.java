package com.company;

public class Repeating_pattern {
    public static void main(String[] args) {
        int l = 65;
        for(int a = 0; a <= 25; a++)
        {
            for(int j = 0; j <= a; j++)
            {
                System.out.print((char) l + "  ");
            }
            l++;
            System.out.println();

        }
    }
}
