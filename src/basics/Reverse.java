// write a code to reverse a number
/**
 * Logic here is suppose 23456 is given then bringing 6 back to its place 
 * rem = num % 10 ; this is reminder where last one digit will go apart decimal 
 * num =num/10;
 * ans *10+rem
 */

import java.util.Scanner;

public class Reverse {
    public static void main (String[] args){
        int num = 28745;

        int ans = 0;
        while(num > 0 ){
            int rem = num % 10;
            num /=10;

            ans = ans *10 +rem;

        }
        System.out.println(ans);
    }
}