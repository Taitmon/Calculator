package com.company;

import java.util.Scanner;

public class IntegerCalculator
{
    private long answer;

    public static void main(String[] args)
    {
        IntegerCalculator calc = new IntegerCalculator();
        calc.run();
    }

    private void run()
    {
        System.out.println("Welcome to the Calculator");

        Scanner input = new Scanner(System.in);

        boolean keepRunning = true;

        System.out.println("Please enter a, A or Add followed by space and  a number you would like to add," +
                " then enter e, E or exit.");
        do
        {
            System.out.println("Enter your command:");
            String command = input.next();

            switch (command)
            {
                case "a":
                case "A":
                case "Add":
                    long addNumber = input.nextLong();
                    add(addNumber);
                    displayAnswer();
                    break;
                case "e":
                case "E":
                case "Exit":
                    keepRunning = false;
                    break;
            }

        }
        while (keepRunning);

        System.out.println("Thank you for using Calculator 2100");
    }

    private void add(long number)
    {
        this.answer += number;
    }

    private void displayAnswer()
    {
        System.out.println("The answer is: " + this.answer);
    }
}