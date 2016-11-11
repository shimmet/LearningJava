/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjavaproject;

import java.util.Scanner;

/**
 *
 * @author seyma
 */
public class BetterCalculator {

    public static void main(String[] Args) {
        int number1, number2, number3;
        String transaction;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        number1 = scan.nextInt();
        System.out.println("Enter the second number");
        number2 = scan.nextInt();
        System.out.println("Choose a transaction:" + "Sum:S /"
                + "Multiply: M/" + "Subtract: N/" + "Divide: D ");
        transaction = scan.next();

        switch (transaction) {
            case "t":
            case "T":
                System.out.println("Sum: " + (number1 + number2));
                break;
            case "c":
            case "C":
                System.out.println("Multiply: " + (number1 * number2));
                break;
            case "d":
            case "D":
                System.out.println("Divide: " + (number1 / number2));
                break;
            case "m":
            case "M":
                System.out.println("Subtract: " + (number1 - number2));
                break;
            default:
                System.out.println("No operation is defined");
                break;

        }

    }

}
