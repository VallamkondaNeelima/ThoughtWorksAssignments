package com.thoughtworks;

import java.util.*;

public class TrainingHours {
    private int dailyHours[];

    public TrainingHours(int dailyHours[]) {
        this.dailyHours = dailyHours;

    }

    public static void main(String[] args) {
        int dailyHours[] = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++)
            dailyHours[i] = sc.nextInt();
        TrainingHours obj = new TrainingHours(dailyHours);
        obj.weeklySalary();
    }

    public void weeklySalary() {
        int weeklySalary = 0, weeklyHours = 0;
        for (int i = 1; i < 6; i++) {
            weeklyHours += dailyHours[i];
            weeklySalary += dailyHours[i] * 100;
            if (dailyHours[i] > 8)
                weeklySalary += (dailyHours[i] - 8) * 15;
        }
        weeklySalary += dailyHours[0] * 150;
        weeklySalary += dailyHours[6] * 125;
        if (weeklyHours > 40)
            weeklySalary += (weeklyHours - 40) * 25;
        System.out.println(weeklySalary);
    }

}
