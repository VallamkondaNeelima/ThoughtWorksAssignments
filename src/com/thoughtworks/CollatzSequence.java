package com.thoughtworks;

import java.util.Scanner;

public class CollatzSequence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Invalid Number");
            return;
        }
        while (number != 1) {
            System.out.print(number + " ");
            if (number % 2 != 0)
                number = 3 * number + 1;
            else
                number /= 2;
       }
        System.out.println(1);
    }
}
