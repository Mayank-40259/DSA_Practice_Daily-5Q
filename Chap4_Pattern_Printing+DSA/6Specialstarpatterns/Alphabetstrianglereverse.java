import java.lang.*;
import java.util.*;


public class Alphabetstrianglereverse {
    

     //Program 28). c). : - Print the given pattern of Alphabets Triangle Reverse.
 

    /*


           A
        A  B
     A  B  C
  A  B  C  D


    */

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of rows m : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of rows n : ");
        int n = sc.nextInt();


        //Logic of program : - print pattern Alphabets Triangle Reverse.
        // 'A' --> 65 to 'Z' --> 90.
        //squaring method : -  (j+64) for column-wise and (i+64) for row-wise in typecasting.
        //method 1). if -> (i+j) > n sout(ch + " ") else -> sout("  ").
        //method 1) ulta process. if -> (i+j) < n sout("  ") else -> sout(ch + " ").
        //method 2). loop insided another loop --> two/one -> another loop.


        char ch;
        if(m == n)
         for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){

                ch = (char)(j+64); //type casting for j+64 --> column-wise same.

                if((i+j) > n){
                  System.out.print(ch + " ");
                }else{
                    System.out.print("  ");
                }

            }
              System.out.println();
        }


        //1st method ka type 2.
        System.out.println();

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){

                ch = (char)(j+64); //type casting for j+64 --> column-wise same.

                if((i+j) < n){
                  System.out.print("  ");
                }else{
                    System.out.print(ch + " ");
                }

            }
              System.out.println();
        }


        System.out.println();
        //2nd method ka code loops insided loops.

         for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n+1-i; j++){  //loop ko ulte triangle ke liye chalayenge hm --> j <= n+1-i;
                System.out.print(" " + " "); // Spaces print karayenge.
            }

            for(int j = 1; j <= i; j++){      //sidhe triangle ka loop --> j <= i;

                ch = (char)(j+64); //type casting for j+64 --> column-wise same. // i+64 --> row wise-same.

                System.out.print(ch + " ");// i for row-wise and j for column wise. // Stars print karayenge.
            }

              System.out.println();
        }



    }    

}
