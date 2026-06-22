import java.lang.*;
import java.util.*;


public class Startriangleulta {


    //Program 19). : - Print the given pattern  star triangle Ulta.
    

    /*

    * * * * *
    * * * *
    * * *
    * *
    * 
     
    */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows m : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns n : ");
        int n = sc.nextInt();


        //Logic of program : -  for Star Triangle ulta is j last point of loop -> n-i+1;
        // star triangle horizontal flip. 


          if(m == n)
            for(int i = 1; i <= m; i++){
                for(int j = 1; j <= n+1-i; j++){
                    System.out.print("* ");

                }
                System.out.println();
            }

    }

}
