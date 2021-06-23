package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double givenPounds = 2.2;
        double resultOfGivenPounds = convertToKilograms(givenPounds);
        System.out.println(resultOfGivenPounds);
    }

    public static double convertToKilograms(double pounds) {
        double kilogramToPounds = .45359237;

        return pounds * kilogramToPounds;
    }
}
