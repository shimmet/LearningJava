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
public class BasicCalculator {
    
    public static void main(String[] args){
        int number1, number2, number3, transaction;
        double result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        number1 = scan.nextInt();
        System.out.println("Enter second number");
        number2 = scan.nextInt();
        System.out.println("Choose one of them: 1:Sum 2:Substract 3:Divide 4:Multiply 5:Mod");
        transaction = scan.nextInt();  
        if (transaction==1){
            System.out.println("Sum:" + (number1 + number2));
        }
        if (transaction==2){
            System.out.println("Substract:" + (number1 - number2));          
        }
        if (transaction==3){
            System.out.println("Divide:" + (number1 / number2));
        }
        if (transaction==4){
            System.out.println("Multiply:" +(number1 * number2));
        }
        if (transaction==5){
            System.out.println("Mod:" +(number1 % number2));
        }
       
        
    }
}
