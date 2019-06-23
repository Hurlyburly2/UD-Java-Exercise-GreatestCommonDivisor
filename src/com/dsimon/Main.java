package com.dsimon;

public class Main {

    public static void main(String[] args) {
        System.out.println(GreatestDivisor.getGreatestCommonDivisor(25, 15) == 5);
        System.out.println(GreatestDivisor.getGreatestCommonDivisor(12, 30) == 6);
        System.out.println(GreatestDivisor.getGreatestCommonDivisor(9, 18) == -1);
        System.out.println(GreatestDivisor.getGreatestCommonDivisor(81, 153) == 9);
    }
}
