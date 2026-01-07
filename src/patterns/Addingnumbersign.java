// Write a code to evaluate the following patterns on output screen 
/**
 * 1=1
 * 1+2=3
 * 1+2+3=6
 * 
 * as n=3
 * 
 */

import java.util.*;
import java.util.Scanner;

public class Addingnumbersign {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();

        //Now initializing outer loop as

        for(int i=1;i<=a;i++){
            int sum = 0;
            //a-1 as it starts form 0 till a as we need a =3 it should go from a=0 to 2 to get the output 3 lines of rows
            for(int j=1;j<=i;j++){

                // i+1 as i=0 j<1 , i=1 j<2 ,i=2 j<3 upto 3 we need to go 
                System.out.print(j);
                //Printing j as we are going into the zone of above j values as 1 ,2 ,3 
                sum+=j;
                //we are excedding this with if else loop 
                if(j<i){
                    System.out.print("+");
                }
            
            }
            System.out.print("=" + sum);
            System.out.println();

        }

    }
}