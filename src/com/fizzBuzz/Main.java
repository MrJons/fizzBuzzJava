package com.fizzBuzz;

public class Main {

    public static void main(String[] args) {
	    for(int i=1; i<=100; i++){
	        System.out.println(fizzBuzz(i));
        }
    }

    public static String fizzBuzz(int number){
        if(number % 15 == 0){
            return "FizzBuzz";
        } else if(number % 5 == 0){
            return "Buzz";
        } else if(number % 3 == 0){
            return "Fizz";
        } else {
            return String.valueOf(number);
        }
    }
}
