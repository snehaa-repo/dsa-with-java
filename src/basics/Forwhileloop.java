// Knowing about For and while loop 
// For loop : if we know the conditions and iterations 
//            Syntax : for(initialization; condition; inc/dec);
// While loop : if we didint know about iterations & initializing is done before while block
//            Syntax : while(condition);


public class Forwhileloop {
    public static void main (String[] args) {
        for(int i = 0; i <= 10; i++){
            System.out.println("For loop :"+i);
        }
        int j = 10;
        while (j >= 0){
                System.out.println("while loop :" + j);
                j--;
        }
    }
}
