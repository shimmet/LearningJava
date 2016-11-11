/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjavaproject;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JButton;

/**
 *
 * @author seyma
 */
public class SwingIntro {

    public static void main(String[] Args) {
        JFrame frame = new JFrame("MyFrame");
        //JFrame sınıfından frame isimli bir nesne oluşturduk ve aekarana myframe isimi ile geldi.

        frame.setSize(400, 400);
        //en boy olarak pixel cinsinden girdik.

        frame.setLocationRelativeTo(null);
        //frame ekranda nerede görülecek. null dersek ortalar

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame kapatıldığında uygulamadan çıkılsın

        frame.setVisible(true);
        //frame in ekranda görünmesi için
        JButton buton = new JButton("OKEY");
        //JButton sınıfından bir buton nesnesi oluşturduk

        frame.add(buton);
        //butonu add metodu ile frame e ekliyoruz

    }
}
