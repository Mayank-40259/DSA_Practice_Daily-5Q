import java.lang.*;
import java.util.*;


public class AlphabetPyramid {

     //Program 28). f). : - Print the given pattern of Alphabets Pyramid.
 


    /*

          A    
      A   B   C
   A  B   C   D   E
A  B  C   D   E   F   G



    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of rows m : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of rows n : ");
        int n = sc.nextInt();


          //Logic of program : - print pattern Alphabet Pyramid.
        //method 1).loop insided another loop --> two/one -> another loop.

        char ch;
          if(m == n)
        for (int i = 1; i <= m; i++){   // lines

              for(int j =1; j <= n-i; j++){    // spaces
                System.out.print(" " + " ");
              }

               for(int j = 1; j <= 2*i-1; j++){  //stars -> using typecasting. i+64 for same in rows and column -> j+64   //columns  //2*i-1 tak loop chalana hai
                ch = (char)(j+64);
                System.out.print(ch + " ");
            }

             System.out.println();

        }


    }

}
