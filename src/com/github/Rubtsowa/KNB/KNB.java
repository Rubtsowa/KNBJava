package com.github.Rubtsowa.KNB;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class KNB {
    public static void main(String[] args) {
        ModelKNB knb = new ModelKNB();
        EventQueue.invokeLater(()-> {
            FrameKNB frame = new FrameKNB(knb);
            frame.setTitle("Камень-ножницы-бумага");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setResizable(false);
        });
    }
    /*
    public static void main(String[] args) {
        int gi,oi,oy;
        oi = 0;
        oy = 0;
        int n = 1;
        while (n==1){
            System.out.println("Правила игры: камень бьёт ножницы, ножницы режут бумагу, бумага заворачивает камень.");
            Scanner in = new Scanner(System.in);
            System.out.print("Введи номер своего жеста(1-камень, 2-ножницы, 3-бумага): ");
            int gy = in.nextInt();
            int a = (int) ( Math.random() * 3 );
            gi = a + 1;
            if (gi==1){
                System.out.print("У меня камень. ");
            }
            else {
                if (gi==2){
                    System.out.print("У меня ножницы. ");
                }
                else{
                    if (gi==3){
                        System.out.print("У меня бумага. ");
                    }
                }
            }
            if (gy==1){
                System.out.print("У тебя камень. ");
            }
            else {
                if (gy==2){
                    System.out.print("У тебя ножницы. ");
                }
                else{
                    if (gy==3){
                        System.out.print("У тебя бумага. ");
                    }
                }
            }
            if (gi==gy){
                System.out.println("Ничья.");
            }
            else {
                if ((gi==1 && gy==2)||(gi==2 && gy==3)||(gi==3 && gy==1)){
                    System.out.println("Я выиграл!");
                    oi = oi + 1;
                }
                else{
                    System.out.println("Ты выиграл!");
                    oy = oy + 1;
                }
            }
            System.out.println("Счёт: у тебя " + oy + " , у меня " + oi + ".");
            System.out.print("Играем ещё? (1-да, 0-нет): ");
            n = in.nextInt();
        }
    }
    */
}
