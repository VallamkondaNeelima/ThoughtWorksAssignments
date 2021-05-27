package com.thoughtworks;

import java.util.*;

public class ArrayType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int array[] = new int[arrayLength];
        for (int index = 0; index < arrayLength; index++) {
            array[index] = sc.nextInt();
        }
        switch (arrayType(array, arrayLength)) {
            case 1:
                System.out.println("The array is Even");
                break;
            case 2:
                System.out.println("The array is Odd");
                break;
            case 3:
                System.out.println("The array is Mixed");
                break;
        }
    }
    public static int arrayType(int array[], int arrayLength) {
        if (arrayLength == 1) {
            if (array[0] % 2 == 0)
                return 1;
            else
                return 2;
        } else {
            for (int index = 1; index < arrayLength; index++) {
                if (array[index] % 2 != array[index - 1] % 2)
                    return 3;
            }
            if (array[arrayLength-1] % 2 == 0)
                return 1;
            else
                return 2;
        }
    }
}
