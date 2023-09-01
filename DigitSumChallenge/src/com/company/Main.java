package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("The sum of all the digits is " + sumDigits(125));

    }
    public static int sumDigits(int number){
        int sumOfAllTheDigits = 0;
        if(number < 10){
            return -1;
        }
        else {
            while (number > 0) {
                sumOfAllTheDigits = sumOfAllTheDigits + (number % 10);
                number = number / 10;
            }
            return sumOfAllTheDigits;
        }
    }
}
