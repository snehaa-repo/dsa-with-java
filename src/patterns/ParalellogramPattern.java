//Writing a code to draw a patterns named Parallelogram :
/**
 * * * * *
 *   * * * *
 *     * * * *
 *       * * * *
 * for n=4
 */

import java.util.Scanner;
import java.util.*;

public class ParalellogramPattern {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0;i<=a-1;i++){
            //for spaces goes as value of i
            for (int j=0;j<=a+i-1;j++){
                
                if(j<i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }
        // Now printing a pattern for next input 
    }
}