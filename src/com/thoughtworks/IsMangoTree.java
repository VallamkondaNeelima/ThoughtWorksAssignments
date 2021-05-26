package com.thoughtworks;

import java.util.*;

public class IsMangoTree {
    public static boolean isMangoTree(int n, int c) {
        return n <= c || n % c == 0 || n % c == 1;
    }

    public static void main(String args[]) {
        int rows, columns, treeNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows in the Garden: ");
        rows = sc.nextInt();
        System.out.println("Enter Number of columns in the Garden: ");
        columns = sc.nextInt();
        System.out.println("Enter treeNumber in the Garden: ");
        treeNumber = sc.nextInt();
        if (treeNumber <= 0 || treeNumber > rows * columns)
            System.out.println("Enter the tree number within the range of 1 to " + rows * columns + " inclusively");
        else if (isMangoTree(treeNumber, columns))
            System.out.println("Mango Tree");
        else
            System.out.println("Not a Mango Tree");

        System.out.println("..........Mango Garden.............");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                int k = (i - 1) * columns + j;
                if (isMangoTree(k, columns))
                    System.out.print("M ");
                else
                    System.out.print("N ");
            }
            System.out.println();
        }
    }
}
