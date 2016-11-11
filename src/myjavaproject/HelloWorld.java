/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjavaproject;

/**
 *
 * @author seyma
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World");
        int a = 10;
        System.out.println("a=" + a);
        System.out.println("a++ =" + a++);
        
        System.out.println("++a değeri = " + ++a);
        System.out.println("a=" + a);
        
        int x=77;
        int y=3;

        System.out.format("x= %d ve y=%d ise x+=y %d" , x,y, x+=y);
        System.out.format("x= %d ve y=%d ise x-=y %d%n" , x,y, x-=y);
        System.out.format("x= %d ve y=%d ise x*=y %d%n" , x,y, x*=y);
        System.out.format("x= %d ve y=%d ise x/=y %d%n" , x,y, x/=y);
        System.out.format("x= %d ve y=%d ise x mod=y %d%n" , x,y, x%=y);
       
    }
    
}
