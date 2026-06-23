import java.lang.*;
import java.util.*;


public class Starcross {


     //Program 28). : - Print the given pattern of Star Cross.
 
    /*

    *           *
       *     *  
          *    
       *     *  
    *           *

    */


     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of rows m : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of rows n : ");
        int n = sc.nextInt();


        //Logic of program : - print pattern Star Cross.
        //1). i == j: Prints the diagonal from the top-left to the bottom-right.
        //2). (i + j) == m + 1: Prints the diagonal from the top-right to the bottom-left (since your loops start at 1).
        //


        //  if(m == n)
         for(int i = 1; i <= m; i++){
            for (int j = 1; j <= n; j++) {
                if(i == j || (i + j) == m + 1){
                    System.out.print("*");
                }else{
                System.out.print(" ");
                }
            }
              System.out.println();
        }
        

         for(int i = 1; i <= m; i++){
            for (int j = 1; j <= n; j++) {
                if(i == j || (i + j) == m + 1){
                    System.out.print("*");
                }else{
                System.out.print(" ");
                }
            }
              System.out.println();
        }


    }    

}
