// Here is the pattern of right angled traingle 
// both the value of i and j are different 
/**
 * 
 * *
 * * *
 * * * * 
 * * * * *
 * * * * * *
 */
 public class Rightangletriangle {
    public static void main(String[] args) {
        int m = 6;
        for(int i =0;i<m;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*" + " ");
            }
            System.out.println("");

        }
    }
 }