package com.satyam;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("first number: ");
        double a = input.nextDouble();
        System.out.print("second number: ");
        double b = input.nextDouble();
        System.out.print("operation to be performed: ");
        char op = input.next().charAt(0);
        double result;
        switch (op) {
            case '+' -> {
                result = a + b;
                System.out.println(result);
            }
            case '-' -> {
                result = a - b;
                System.out.println(result);
            }
            case '*' -> {
                result = a * b;
                System.out.println(result);
            }
            case '/' -> {
                if (b != 0) {
                    result = a / b;
                    System.out.println(result);
                } else {
                    System.out.println("b is equal to zero, can't perform division");
                }
            }
            case '%' -> {
                if (b != 0) {
                    result = a % b;
                    System.out.println(result);
                } else {
                    System.out.println("b is equal to zero, can't perform division");
                }
            }
            default -> System.out.println("Invalid Operator.");
        }

    }
}