import java.lang.*;
import java.util.*;


public class Numberstartriangle {


    //Program 13). : - Print the given number star pattern row-wise distribution.

    //depending on i of column loop;

     /*
    1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Enter the number of rows m : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns n : ");
        int n = sc.nextInt();


        
        //logic of program : - Number Triangle. row-wise-distribution.


        if(m == n)
        for(int i = 1; i <= m; i++){
              for(int j = 1; j <= i; j++){
                System.out.print(i+" ");

              }

              System.out.println();

          }

    }

}
