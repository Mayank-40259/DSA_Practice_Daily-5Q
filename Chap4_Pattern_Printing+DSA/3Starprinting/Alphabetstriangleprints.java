import java.lang.*;
import java.util.*;

public class Alphabetstriangleprints {


    //Program 15). : - print the given Alphabets (row-wise-same) pattern.


    /*
    A
    B B
    C C C
    D D D D
    E E E E E
    */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows m : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns n : ");
        int n = sc.nextInt();


        //logic of program : - Alphabets Triangle. row-wise distribution 
        //in typecasting (j+64); --> (i+64);

        char ch;
        if(m == n)
        for(int i = 1; i <= m; i++){
              for(int j = 1; j <= i; j++){
                //typecasting - logic.
                ch = (char)(i+64);   //65 -> 'A' to 90 -> 'Z'.
                System.out.print(ch + " ");

              }

              System.out.println();

          }

    }

}
