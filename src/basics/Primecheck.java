// Write a code to check whether the number by user is prime or not 

//three condition are applied here : 
        /**
         * check the number is 1 or less than that is not a prime number 
         * 
         * check if number is greater than 2 then check whether % 2 == 0
         * then while checking above condition check whether you are applying checking in between 2 to that numbers ,
         *      then only chcek upto numbers whihc are divisible by its square root 
         * 
         * if no then print output as prime number  
         */
    
import java.io.*;
import java.util.*;

public class Primecheck {
    public static void main (String[] args) {

        int num = 3;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
        }
        }

        if (isPrime) {
        System.out.println("Prime");
        } else {
        System.out.println("Not Prime");
        }
    }
}