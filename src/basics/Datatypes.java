

// Primitive : byte, short, int , ilong, float, double, char, boolean
// used in dsa : int --> arr, loops, index ; 
//               long --> large sums;
//               char --> strings, characters
//               boolean --> conditions


// Non -primitive(memory address is stored) : array (int []arr={1,2,3};), strings("Snehal"), 
//                                            classes(Scanner sc = new scanner(System.in);), interfaces (Runnable r;) 


public class Datatypes {
    public static void main(String[] args) {
        int value = 1234;
        float measure_value = 58.69f;
        double measure = 58.698765;
        char name = 'S';
        boolean check = true;

        System.out.println(value);
        System.out.println(measure_value);
        System.out.println(measure);
        System.out.println(name);
        System.out.println(check);

        String str = "Hello World";
        System.out.println(str);

        int[] arr = {1,2,3,4,5};
        System.out.println(arr[0]);

     //Scanner class is used to take input from the user
        java.util.Scanner sc = new java.util.Scanner(System.in); 
        //java.util is package name and Scanner is class name 
        
        System.out.println("Enter a number: ");
        
    //Moving to last interfaces
        Runnable r; 
        //this is how we declare an interface and we will learn more about it in later modules.       
    }
}