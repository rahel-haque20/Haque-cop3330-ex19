/*
* UCF COP 3330 Fall 2021 Assignment 19 Solution
* Copyright 2021 Rahel Haque
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height: ");
        String h = input.next();
        int x = Integer.parseInt(h);

        System.out.println("Enter weight: ");
        String w = input.next();
        int y = Integer.parseInt(w);

        int BMI = (y / (x * x)) * 703;
        String result = "test";

        if((BMI<=25) && (BMI>=18.5))
            result = "You are within the ideal weight range";

        else if(BMI>25)
            result = "You are overweight";

        else if(BMI<18.5)
            result = "You are underweight";

        System.out.printf("Your BMI is %d%n%s", BMI, result);
    }
}