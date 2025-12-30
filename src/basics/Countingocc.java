// Write a code to evaluate number occuring in that element 

/**
 * we ahve to check each ele and update the value of count and then count++ for counting in way ahead
 * 
 *
 */

import java.util.Scanner;
import java.util.*;

public class Countingocc {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int n = 4556255;

        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem == 5){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);

    }
}