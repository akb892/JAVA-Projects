package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 0,sum=0;
        for( int i = 1; i <= 1000; i++){
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("The " + (count + 1)  + " number is : " + i );
                count++;
                sum = sum + i;
            }
            if(count == 5){
                break;
            }
        }
        System.out.println("The sum of all the numbers is : " + sum );
    }
}
