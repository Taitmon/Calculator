package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerCalculator
{
    private long answer;
    private ArrayList<String> history = new ArrayList<>();
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
            System.out.println("If you are doing a math problem enter a command followed by a number, " +
                    "else enter a command:");
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
                case "s":
                case "S":
                case "subtract":
                    long subtractNumber = input.nextLong();
                    subtract(subtractNumber);
                    displayAnswer();
                    break;
                case "m":
                case "M":
                case "multiply":
                    long multiplyNumber = input.nextLong();
                    multiply(multiplyNumber);
                    displayAnswer();
                    break;
                case "d":
                case "D":
                case "Divide":
                    long divideNumber = input.nextLong();
                    divide(divideNumber);
                    displayAnswer();
                    break;
                case "h":
                case "H":
                case "history":
                    displayHistory();
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
        history.add("Add" + number);
    }
    private void subtract(long number)
    {
        this.answer -= number;
        history.add("Subtract" + number);
    }
    private void multiply(long number)
    {
        this.answer *= number;
        history.add("Multiply" + number);
    }
    private void divide(long number)
    {
        this.answer /= number;
        history.add("Divide" + number);
    }

    private void displayHistory()
    {
        for (String inputs: history)
        {
            System.out.println(inputs);
        }
    }

    private void displayAnswer()
    {
        System.out.println("The answer is: " + this.answer);
    }
}