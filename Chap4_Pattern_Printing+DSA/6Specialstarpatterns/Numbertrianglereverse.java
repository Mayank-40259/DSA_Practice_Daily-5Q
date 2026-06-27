import java.lang.*;
import java.util.*;

public class Numbertrianglereverse {
    

    //Program 28). b). : - Print the given pattern of Number Triangle Reverse.
 
    /*

           1
        1  2
     1  2  3
  1  2  3  4


    */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of rows m : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of rows n : ");
        int n = sc.nextInt();

        //Logic of program : - print pattern Numbers Triangle Reverse.
        //squaring method : -  j for column-wise and i for row-wise.
        //method 1). if -> (i+j) > n sout(j + " ") else -> sout("  ").
        //method 1) ulta process. if -> (i+j) < n sout("  ") else -> sout(i + " ").
        //method 2). loop insided another loop --> two/one -> another loop.


        if(m == n)
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if((i+j) > n)
                  System.out.print(i + " ");
                else
                    System.out.print("  ");
            }
              System.out.println();
        }

        //1st method-type 2). 
        System.out.println();

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if((i+j) < n)
                  System.out.print("  ");
                else
                    System.out.print(i + " ");
            }
              System.out.println();
        }


        System.out.println();
        //2nd method Number Triangle Reverse. 
        //yahi question me print karne ki bola hai ush ne.
        

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n+1-i; j++){  //loop ko ulte triangle ke liye chalayenge hm --> j <= n+1-i;
                System.out.print(" " + " "); // Spaces print karayenge.
            }
            for(int j = 1; j <= i; j++){      //sidhe triangle ka loop --> j <= i;
                System.out.print(j + " ");// i for row-wise and j for column wise. // Stars print karayenge.
            }

              System.out.println();
        }



    }

}
