package control_flow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // comparison operators
        int x = 1;
        int y = 2;
        System.out.println(x == y);
        // <= != > < >=
        // logical operators
        int temp = 22;
        boolean isWarm = temp > 20 && temp < 20;
        System.out.println(isWarm);
        // || !
        // if statements
        int temperature = 32;
        if (temperature > 30) {
            System.out.println("hot");
        } else if (temperature > 20) {
            System.out.println("Good");
        } else {
            System.out.println("cold");
        }
        // if statements 2.0
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);
        // Ternary operator
        int money = 120_000;
        String className = money > 100_000 ? "First" : "Economy";
        System.out.println(className);
        // Swicth statements
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("you are admin");
                break;
            case "moderator":
                System.out.println("you are moderator");
                break;
            default:
                System.out.println("you are guest");
        }
        // for loops
        for (int i = 0; i < 5; i++) {
            System.out.println("WOW");
        }
        // i--
        // while loops
        String input = "";
        Scanner in = new Scanner(System.in);
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = in.next().toLowerCase();
            System.out.println(input);
        }
        in.close();
        // Do..While Loops
        do {
            System.out.print("Input: ");
            input = in.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));
        in.close();
        // Break & Continue statements
        String input2 = "";
        Scanner in2 = new Scanner(System.in);
        while (true) {
            System.out.print("Input: ");
            input2 = in2.next().toLowerCase();
            if (input2.equals("pass")) {
                continue;
            } else if (input2.equals("quit")) {
                break;
            }
            System.out.println(input2);
        }
        in2.close();
        // For Each Loop
        String[] fruits = { "Apple", "Orange", "Mango" };
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}
