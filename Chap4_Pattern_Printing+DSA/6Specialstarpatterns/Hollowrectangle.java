import java.lang.*;
import java.util.*;


public class Hollowrectangle {
    

     //Program 27). : - Print the given pattern of star plus.
 
    /*

    * * * * * *
    *         *
    *         *
    * * * * * *

    */


     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of rows m : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of rows n : ");
        int n = sc.nextInt();

        
         //Logic of program : - Star plus shaped pattern.
        // ya toh mera first row ho ya fir last row --> print the star ("* ").
        //ya toh mera first column ho ya last column --> print the ("  ").


        if(m == 4 && n == 6  || m == 6 && n == 4)
         for(int i = 1; i <= m; i++){
            for (int j = 1; j <= n; j++) {

                if(i == 1 || i == m || j == 1 || j == n){
                   System.out.print("* ");
                }else{
                    System.out.print("  ");
                }    

            }
              System.out.println();
        }   


    }

}
