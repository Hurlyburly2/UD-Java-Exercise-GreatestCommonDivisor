package com.dsimon;

public class GreatestDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int highestDivisor = 0;
        if (first > second) {
            highestDivisor = first / 2;
        } else {
            highestDivisor = second / 2;
        }
        highestDivisor++;

        int greatestCommonDivisor = 1;
        for (int i = 1; i < highestDivisor; i++) {
            if (first % i == 0 && second % i == 0) {
                greatestCommonDivisor = i;
            }
        }

        return greatestCommonDivisor;
    }
}
