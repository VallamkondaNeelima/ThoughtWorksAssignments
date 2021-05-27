package com.thoughtworks;

import java.util.*;

public class ArrayRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int array[] = new int[arrayLength];
        for (int index = 0; index < arrayLength; index++) {
            array[index] = sc.nextInt();
        }
        System.out.println(range(array));

    }

    public static int range(int array[]) {
        int maximumElement = array[0], minimumElement = array[0];
        for (int element : array) {
            if (element < minimumElement)
                minimumElement = element;
            if (element > maximumElement)
                maximumElement = element;
        }
        return maximumElement - minimumElement;
    }


}
