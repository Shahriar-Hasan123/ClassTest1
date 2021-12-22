package com.company;

import java.util.Scanner;

public class Balloon {
    public static double redius = 0;

    public static void main(String[] args) {
        double amount;
        Scanner input = new Scanner(System.in);
        amount = input.nextDouble();
        inflate(amount);
        System.out.println(getVolume());
    }

    public static void inflate(double amount) {
        redius = redius + amount;
    }

    public static double getVolume() {

        return (4.0 / 3.0) * Math.PI * redius * redius * redius;
    }


}
