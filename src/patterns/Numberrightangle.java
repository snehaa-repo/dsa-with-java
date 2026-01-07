// Pattern is : number with number times
/**
 1
 2 2
 3 3 3
 4 4 4 4 

 N = 4 it should print as above
 */

public class Numberrightangle {
    public static void main(String[] args) {
        int n = 4;
        for (int i =0; i<=n; i++){
            for(int j = i; j<2*(i);j++){
                
                //in above we have to print j=1 and then getting first row as 1234
                //then following the condition of at last there are 2*i digits as 0 

                System.out.print(j);
            }
        System.out.println("");
        }

    }
}