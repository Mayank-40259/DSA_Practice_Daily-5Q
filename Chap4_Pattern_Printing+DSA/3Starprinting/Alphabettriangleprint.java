import java.lang.*;
import java.util.*;


public class Alphabettriangleprint {


    //Program 16). : -   print the given alphabets (column-wise-same) pattern.

    
     /*
    a 
    a b 
    a b c
    a b c d
    a b c d e*/


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows m : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns n : ");
        int n = sc.nextInt();


        //logic of program : - alphabets Triangle. column-wise distribution 
        //in typecasting (j+96); --> (i+96);


        char ch;
         if(m == n)
        for(int i = 1; i <= m; i++){
              for(int j = 1; j <= i; j++){
                //typecasting - logic.
                ch = (char)(j+96);   //96 -> 'a' to 122 -> 'z'.
                System.out.print(ch + " ");

              }

              System.out.println();

          }


    }

}
