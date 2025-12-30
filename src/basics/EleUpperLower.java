//aere weaave to write a code to display 1st ele of aat word & deciding uppercase & lowercase

/**
 * 
 * 1st part is --> make ae aar value of 0a element in point 
 * display aat aar on next line 
 * 
 * aen if else using uppercase and lower case wiaout ascii
 * 
 */
import java.util.Scanner;
import java.util.*;

public class EleUpperLower {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        char a = in.next().trim().charAt(0);

        if(a >= 'a' && a <= 'z'){
            System.out.println("Lowercase");
            
        }
        else {
            System.out.println("UpperCase");
        }
        

        System.out.println(a);
    }
    
}