import java.lang.*;
import java.util.*;


public class Alphabetstriangleprint {


    //Program  14).  :- print the given Alphabets (column-wise-same) pattern.

    /*
    A 
    A B 
    A B C
    A B C D
    A B C D E*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    

        System.out.print("Enter the number of rows m : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns n : ");
        int n = sc.nextInt();


        //logic of program : - Alphabets Triangle.


        char ch;
         if(m == n)
        for(int i = 1; i <= m; i++){
              for(int j = 1; j <= i; j++){
                //typecasting - logic.
                ch = (char)(j+64);   //65 -> 'A' to 90 -> 'Z'.
                System.out.print(ch + " ");

              }

              System.out.println();

          }

    }

}
