import java.lang.*;
import java.util.*;


public class Starplus {


    //Program 27). : - Print the given pattern of star plus.
 
    /*
         *
         *
     * * * * * 
         * 
         * 
    */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of rows m : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of rows n : ");
        int n = sc.nextInt();

         //Logic of program : - Star plus shaped pattern.
        // 

        int mid = n/2 + 1;
 

        for(int i = 1; i <= m; i++){
            for (int j = 1; j <= n; j++) {
                
             if(i == mid || j == mid){
              System.out.print("* ");
              }else{
              System.out.print("  ");
              }

            }
              System.out.println();
        }   


    }
}
