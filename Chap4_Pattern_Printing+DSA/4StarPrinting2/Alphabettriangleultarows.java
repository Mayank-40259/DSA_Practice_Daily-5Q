import java.lang.*;
import java.util.*;


public class Alphabettriangleultarows {


    //Program 23). : - Print the given pattern alphabets triangle ulta column wise same.


     /*

    A A A A A
    B B B B
    C C C
    D D
    E

     */

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Enter the number of rows m : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns n : ");
        int n = sc.nextInt();

        //Logic of program : -  for Alphabets Triangle ulta is j last point of loop -> n-i+1;
        // alphabets triangle horizontal flip. 
        //in typecating for row wise --> j+64 to i+64;


        char ch;
         if(m == n)
            for(int i = 1; i <= m; i++){
                for(int j = 1; j <= n+1-i; j++){
                    ch = (char)(i+64); //typrcasting j+64 --> ch --> 65 -> 'A' to 90 -> 'Z'.
                    System.out.print(ch + " ");  //rows-wise distribution of number triangle ulta.

                }

                System.out.println();

            }


    }
}
