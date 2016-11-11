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
public class IfExample {

    public static void main(String[] args) {
        int age = 0, number = 0;
        String name = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        age = scan.nextInt();
        System.out.println("Enter your name");
        name = scan.next();
        System.out.println("Enter your number");
        number = scan.nextInt();
        if (name.equals("alex") && number == 10 || number == 34) {
            System.out.println("name:" + name + " number:" + number + "age:" + age);
        } else {
            System.out.println("You are not Alex");
        }

    }

}
