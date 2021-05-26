package com.thoughtworks;
/* Question: In the University Examinations conducted during the past 5 years,
the toppers registration numbers were 7126, 82417914, 7687 and 6657. Your father is an expert in data mining and
he could easily infer a pattern in the toppers registration numbers. In all the registration numbers listed here,
the sum of the odd digits is equal to the sum of the even digits in the number. He termed the numbers that satisfy this
property as Probable Topper Numbers. Write a program to find whether a given number
is a probable topper number or not. */

import java.util.*;

public class Student {
    int registrationNumber;

    public Student(int registrationNumber) {
        this.registrationNumber = registrationNumber;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int registrationNumber = sc.nextInt();
        Student obj = new Student(registrationNumber);
        obj.isTopperNumber();

    }

    public void isTopperNumber() {
        int evenDigitSum = 0, oddDigitSum = 0, digit;
        int dummy = registrationNumber;
        while (dummy != 0) {
            digit = dummy % 10;
            if (digit % 2 == 0)
                evenDigitSum += digit;
            else
                oddDigitSum += digit;
            dummy /= 10;

        }
        if (evenDigitSum == oddDigitSum)
            System.out.println(registrationNumber + " is a Topper Number");
        else
            System.out.println(registrationNumber + " is not a Topper Number");
    }
}
