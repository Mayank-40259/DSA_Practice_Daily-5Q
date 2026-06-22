import java.lang.*;
import java.util.*;


public class Numbertriangleultarows {


    //Program 21). : - Print the given pattern number triangle ulta rows wise same.


    /*

    1 1 1 1 1
    2 2 2 2
    3 3 3
    4 4
    5

     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows m : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns n : ");
        int n = sc.nextInt();

        //Logic of program : -  for Number Triangle ulta is j last point of loop -> n-i+1;
        // number triangle horizontal flip. 

        
          if(m == n)
            for(int i = 1; i <= m; i++){
                for(int j = 1; j <= n+1-i; j++){
                    System.out.print(i+" ");  //rows-wise distribution of number triangle ulta.

                }

                System.out.println();

            }

    }

}
