package com.thoughtworks;

import java.util.*;

public class AllocateLab {

    public static void main(String[] args) {
        // write your code here
        int labCapacity[] = new int[3];
        int studentCount, min = Integer.MAX_VALUE;
        String allocatedLab = "";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            labCapacity[i] = sc.nextInt();
        }
        studentCount = sc.nextInt();
        for (int j = 0; j < 3; j++) {
            if (studentCount <= labCapacity[j]) {
                if (labCapacity[j] - studentCount < min) {
                    min = labCapacity[j] - studentCount;
                    allocatedLab = j + 1 + " ";
                } else if (labCapacity[j] - studentCount == min)
                    allocatedLab += j + 1 + " ";
            }
        }
        if (allocatedLab == "")
            System.out.println("No Labs are allocated");
        else
            System.out.println(allocatedLab);
    }
}
