import java.lang.*;
import java.util.*;



public class Numberstarprint {

    //Program 12). : - Print the given number star pattern column-wise distribution.

    //depending on i of column loop;

    /*

    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows m : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns n : ");
        int n = sc.nextInt();


        //logic of program : - Number Triangle.


        if(m == n)
        for(int i = 1; i <= m; i++){
              for(int j = 1; j <= i; j++){
                System.out.print(j+" ");

              }

              System.out.println();

          }


    }

}
