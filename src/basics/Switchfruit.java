// Generate a code to understand switch statements 

// there are nested switch cases available also 

import java.util.Scanner;

public class Switchfruit{
    public static void main(String[] args){

        Scanner in = new Scanner (System.in);
        System.out.println("Enter any fruit name : ");
        String fruit = in.next();

        switch(fruit){
            case "Mango":
                System.out.println("this is yellow in colour");
                break;

            case "Apple":
                System.out.println("This is red in colour sometimes green");
                break;

            case "Guava":
                System.out.println("This is in Green in colour");
                break;

            default:
                System.out.println("Invalid input");
            }

        }

}
