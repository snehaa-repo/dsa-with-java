/**
 * Wrriting a code for Alphabets right agle with 1st row same as ABCD then folowing the next without counter no counter is needed 
 * 
 * A
 * B C
 * C D E
 * D E F G
 * E F G H I
 * 
 */


import java.util.*;
import java.util.Scanner;

public class Alphabetsrightangle {
    public static void main(String[] args){
        int n=5;
        for (int i=0;i<n;i++){
            for (int j=i;j<2*(i);j++){
                System.out.print((char)(64+j)+ " ");
            }
            System.out.println("");
        }
}

}
