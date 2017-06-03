package com.suyue.introductory;

public class FizzBuzz {
    public void printFizzBuzz(int start, int end){
        for(int i=start; i<=end; i++) {
            if(i%3 == 0 && i%5 ==0) {
                System.out.println("FizzBuzz");
            } else if(i%3 == 0) {
                System.out.println("Fizz");
            } else if(i%5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
