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
public class SwitchExample {

    public static void main(String[] Args) {
        int day;
        Scanner scan = new Scanner(System.in);

        System.out.println("Which day of the week?");
        day = scan.nextInt();

        switch (day) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Not a valid day");

        }

    }

}
