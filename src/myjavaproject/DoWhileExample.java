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
public class DoWhileExample {

    public static void main(String[] Args) {
        int request;
        String value;
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        System.out.println("number" + number);
        scan.nextLine();
        String name = scan.nextLine();
        System.out.println("name" + name);

        do {
            System.out.println("List of addresses");

            System.out.println("1 - Create a new phone number");
            System.out.println("2 - Delete the number");
            System.out.println("3 - Update the number");
            System.out.println("4 - See the number");
            System.out.println("5 - Exit \n");

            System.out.println("Your choice: (1,2,3,4,5): ");
            request = scan.nextInt();

            //Kullanıcının isteğini yap
            switch (request) {
                case 1:
                    System.out.println("Do you want to create a new number?");
                    break;
                case 2:
                    System.out.println("Do you want to delete the number?");
                    break;
                case 3:
                    System.out.println("Do you want to update the number?");
                    break;
                case 4:
                    System.out.println("Do you want to see the number?");
                    break;
                case 5:
                    System.out.println("Goodbye !");
                    break;
                default:
                    System.out.printf("%d it is not a valid choice %n", request);
                    break;
            }

            System.out.println("Press a button to continue...");
            value = scan.next();
            System.out.println();
        } while (request != 5);//çıkış tuşuna(5) e basılana kadar döngüyü tekrarlatan boolean

    }

}
