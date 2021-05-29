package com.thoughtworks;

import java.util.*;

public class LowerTriangularMatrix {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int squareLength;
        squareLength = sc.nextInt();
        if (sc.nextInt() != squareLength || squareLength<0)
            System.out.println("no");
        else {
            System.out.println(lowerTriangularMatrix(squareLength)?"yes":"no");
        }
    }
    public static boolean lowerTriangularMatrix(int squareLength)
    {
        for(int row=0; row<squareLength;row++)
        {
            for(int column=0; column<squareLength;column++)
            {
                if(row>=column)
                    sc.nextInt();
                else if(sc.nextInt()!=0)
                    return false;
            }
        }
        return true;
    }
}

