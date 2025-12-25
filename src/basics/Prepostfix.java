// we are here to understand about preffix and postffix , 
// pre --> ++i or --i : it will directly add 1 to it and display the value.
// post --> i++ or i-- : it will create a copy of i original value and display it and then stores +1 for new iteration.


public class Prepostfix {
    public static void main (String[] args ) {
        int i = 0;
        System.out.println(++i); //Prefix i = 1
        System.out.println();
        System.out.println(i++); //Postfix i = 1 original and for next i = 2
        System.out.println(i);

        System.out.println();
        System.out.println();
        System.out.println(--i); // prefix i = 2-1 = 1
        System.out.println(i--); // Postfix i = 1 original displays then converts i=1-1=0
        System.out.println(i);

    }
}