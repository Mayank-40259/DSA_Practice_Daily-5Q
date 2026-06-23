import java.lang.*;
import java.util.*;


public class Oddnumbertriangle {

    //Program 24). print the given pattern odd number triangle.


    /*

    1
    1 3
    1 3 5
    1 3 5 7
    1 3 5 7 9

     */


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows m : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of rows n : ");
        int n = sc.nextInt();

        //Logic of program : - odd number triangle printing.
        //method 1. (2*j-1). in inside loop sout().
        //method 2. using variable initialization method--> int a = 1; between outer or inner row and increment by a += 2 -> in inner row.


        if(m == n)
            for(int i = 1; i <= m; i++){
                  int a = 1;
                 for(int j = 1; j <= i; j++){
                        //show and apply in pattern design --> (2*j-1).
                    System.out.print(a + " ");   //(2*j-1).
                    a += 2;
                 }
                 System.out.println();
        }

    }
}
