import java.lang.*;
import java.util.*;


public class StarTriangleReverse {


     //Program 28). a). : - Print the given pattern of Star Triangle Reverse.
 
    /*

           *
        *  *
     *  *  *
  *  *  *  *


    */


     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of rows m : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of rows n : ");
        int n = sc.nextInt();

        //Logic of program : - print pattern Star Triangle Reverse.
        //method 1). if -> (i+j) > n sout("*") else -> sout("  ").
        //method 1) ulta process. if -> (i+j) < n sout("  ") else -> sout("*").
        //method 2).loop insided another loop --> two/one -> another loop.


        if(m == n)
         for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if((i+j) > n)
                  System.out.print(" *");
                else
                    System.out.print("  ");
            }
              System.out.println();
        }


        System.out.println();
        //1st method ka type 2.
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if((i+j) > n)
                  System.out.print(" *");
                else
                    System.out.print("  ");
            }
              System.out.println();
        }



        System.out.println();
        //2nd method star triangle reverse.
        
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n+1-i; j++){  //loop ko ulte triangle ke liye chalayenge hm --> j <= n+1-i;
                System.out.print(" " + " "); // Spaces print karayenge.
            }
            for(int j = 1; j <= i; j++){      //sidhe triangle ka loop --> j <= i;
                System.out.print("*" + " "); // Stars print karayenge.
            }

              System.out.println();
        }


    }    

}
