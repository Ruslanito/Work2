package com.ruslanito.Core.Core_BitsBytes;

import java.util.Scanner;

public class BitsInBytes {
    public static void main(String[] args) {
        int t;
        byte value;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введи значение value в десятиричной СС:");
        value = sc.nextByte();

        System.out.println("Значение value в двоичной СС:");
        for (t = 128; t > 0; t = t / 2) {
            if ((value & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }

}