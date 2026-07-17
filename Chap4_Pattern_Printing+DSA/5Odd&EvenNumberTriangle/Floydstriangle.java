import java.lang.*;
import java.util.*;


public class Floydstriangle {


    //Program 25). : - Print the given Pattern 

    /*
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
     */


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of rows m : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of rows n : ");
        int n = sc.nextInt();


        //Logic of program : - Floyds triangle .
        // using external variable initialization method.

        int a = 1;
        if(m == n)
        for(int i = 1; i <= m; i++){
            for(int j =1; j <= i; j++){
                System.out.print(a + " ");
                if(a<10) System.out.print(" ");
                a++;  //for printing numbers liki counting through increment.
            }
            System.out.println();
        }

    }

}
