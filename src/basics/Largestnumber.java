// write a code to check the largest number in number user input 

// There are total of two ways to perform this operations one is if else with 
/**
 * max = a;
 * if(b>a){ max = b};
 * if (c>b && c<a){ max = c} 
 * return max 
 */
import java.util.Scanner;
import java.io.*;

public class Largestnumber {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in); 
//Here in is used as scanner i.e obj class and on next lines use in.nextInt(); 
// if sc the use sc.nextInt()

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int Largevalue = Math.max(c, Math.max(a,b));

        //using math.max(contains two objects inside math will calculate the max object value and return it )
        System.out.println(Largevalue);
    }
}