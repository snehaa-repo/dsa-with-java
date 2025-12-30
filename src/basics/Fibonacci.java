// Write a code for Fibonacci series in java 
/**
 * Fibonacci will add previous and current values and goes on
 * 
 * 0,1,1,2,3,5,8,13,21,.....
 * 
 */

import java.util.*;
import java.util.Scanner;

public class Fibonacci {
    public static void main (String[] args){
        //provide a =0, b=1, count =2, while with tempcunt ++ 
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count<=n){
            int temp = b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);
    }
}