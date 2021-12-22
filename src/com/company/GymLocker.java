package com.company;

import java.util.Scanner;

public class GymLocker {
    public static void main(String[] args) {
         //array declaration
        int[] secret= new int[3];
        int[] ticks = new int[3];


        //Take secret data  input
        Scanner keyBoardInput = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            secret[i]=keyBoardInput.nextInt();
        }
        //Take ticks input
        for (int i = 0; i < 3; i++) {
            ticks[i] = keyBoardInput.nextInt();
        }

        //Funcation call..................
        Combolock combolock = new Combolock(secret[0], secret[1], secret[2]);

        combolock.reset();
        for (int i = 0; i < 3; i++) {
            if (i==1){ combolock.turnLeft(ticks[i]);}
            else {combolock.turnRight(ticks[i]);}
        }

        //Output............
        if(combolock.open()==true)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

