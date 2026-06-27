import java.lang.*;
import java.util.*;



public class Rhombus {


     //Program 28). e). : - Print the given pattern of Star Triangle Reverse with square and draw Rhombus.
 


    /*

           *  *  *  *
        *  *  *  *
     *  *  *  *  
  *  *  *  *


    */

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of rows m : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of rows n : ");
        int n = sc.nextInt();

        //Logic of program : - print pattern Star Triangle Reverse with square draw Rhombus.
        //method 1).loop insided another loop --> two/one -> another loop.



        System.out.println();
        //1st method star triangle reverse with square draw Rhombus.
        
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n+1-i; j++){  //n+1-i --> n-i bhi laga sakte ho. last limit of loop//loop ko ulte triangle ke liye chalayenge hm --> j <= n+1-i;
                System.out.print(" " + " "); // Spaces print karayenge.
            }
            for(int j = 1; j <= n; j++){      //sidhe triangle ka loop --> j <= i;
                System.out.print("*" + " "); // Stars print karayenge.
            }

              System.out.println();
        }

        System.out.println();

    }

}
