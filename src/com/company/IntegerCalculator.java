package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerCalculator
{
    private long answer;
    private ArrayList<MathStep> history = new ArrayList<>();
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
            System.out.println("Enter a command:");
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
                case "c":
                case "C":
                case "Clear":
                    clear();
                    break;
                case "ch":
                case "CH":
                case "clear History":
                    history.clear();
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
        MathStep mathStep = new MathStep("Add", number);
        history.add(mathStep);
    }
    private void subtract(long number)
    {
        this.answer -= number;
        MathStep mathStep = new MathStep("Subtract", number);
        history.add(mathStep);
    }
    private void multiply(long number)
    {
        this.answer *= number;
        MathStep mathStep = new MathStep("Multiply", number);
        history.add(mathStep);
    }
    private void divide(long number)
    {
        this.answer /= number;
        MathStep mathStep = new MathStep("Divide", number);
        history.add(mathStep);
    }

    private void displayHistory()
    {
        for (MathStep mathStep: history)
        {
            System.out.println(mathStep.getAction() + mathStep.getValue());
        }
    }

    private void clear()
    {
        this.answer = 0;
    }

    private void displayAnswer()
    {
        System.out.println("The answer is: " + this.answer);
    }
}