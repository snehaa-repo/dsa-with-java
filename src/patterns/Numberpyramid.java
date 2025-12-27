/**
 *  * ****1****
  * ***232***
   * **34543**
    * *4567654*
     */
import java.util.*;
import java.io.*;
    
public class Numberpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =0; i<n; i++){
            //for spaces 
            for(int j = 0; j<n-i-1;j++){

                System.out.print(" ");
            }
            int sv1 = i+1;
            for(int k=0; k<sv1;k++){
                System.out.print(sv1);
                sv1++;//counter ascending order
            }
            //for 2nd traingle 
            /**
             * 0
             * 2
             * 43
             * 654
             */
            int sv2 = 2*i;
            for(int k=0; k<i;k++){
                System.out.print(sv2);
                sv2--; //counter descending order
            }
            System.out.println("");
        }

    }
}