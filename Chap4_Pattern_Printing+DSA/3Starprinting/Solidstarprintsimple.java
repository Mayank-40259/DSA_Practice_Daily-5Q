import java.lang.*;
import java.util.*;


public class Solidstarprintsimple {


    //Program 11). : - Print the given solid star pattern.

    //depending on i of column loop.

    /* solid-star pattern

    *
    * *
    * * *
    * * * * 
    
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of rows m : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns n : ");
        int n = sc.nextInt();

        //Logic of program : - right-angled isoceles triangle.

        if(m == n)
        for(int i = 1; i <= m; i++){  //condition me m likhoge.
            
            for(int j = 1; j <= i; j++){  //condtion me n nahi likoge --> i from loop outer. 

                System.out.print("* ");

            }

            System.out.println();

        }

    }

}
