// star pyramid , 
/*
    *    
   ***
  *****
 *******
*********

two rules : ROS and GT
two inner loop --> 1 for space and 2nd for star

Time Complexity : o(m*n)
*/

public class Starpyramid {
    public static void main (String[] args){
        int row = 5;
        for(int i = 0 ; i < row ; i++){

            for(int j = 0; j < (row - i*1) ; j++){
                System.out.print(" ");

            }
            for(int k = 0; k <(1+2*i) ;k++){
                System.out.print("*");

            }
            System.out.println("");
        }
    }
}



