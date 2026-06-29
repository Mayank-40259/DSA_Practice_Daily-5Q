import java.lang.*;
import java.util.*;


public class NumberPyramid {

     //Program 28). f). : - Print the given pattern of Number Pyramid.
 


    /*

          1    
      1   2   3
   1  2   3   4   5
1  2  3   4   5   6   7


    */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Enter the number of rows m : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of rows n : ");
        int n = sc.nextInt();

         //Logic of program : - print pattern Number Pyramid.
        //method 1).loop insided another loop --> two/one -> another loop.

         if(m == n)
        for (int i = 1; i <= m; i++){   // lines

              for(int j =1; j <= n-i; j++){    // spaces
                System.out.print(" " + " ");
              }

               for(int j = 1; j <= 2*i-1; j++){  //stars -> i for same in rows and column -> j   //columns  //2*i-1 tak loop chalana hai
                System.out.print(j + " ");
            }

             System.out.println();

        }

    }

}
