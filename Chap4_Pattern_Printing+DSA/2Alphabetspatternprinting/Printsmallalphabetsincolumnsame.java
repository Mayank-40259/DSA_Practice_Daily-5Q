import java.lang.*;
import java.util.*;


public class Printsmallalphabetsincolumnsame {


    //Program  8).  : - print small alphabets column-wise same.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of rows m : ");
        int m = sc.nextInt();
        System.out.print("Enter the Number of columns n : ");
        int n = sc.nextInt();

        //Logic of program :-


         /* Pattern in.
        a  b  c  d
        a  b  c  d
        a  b  c  d
        a  b  c  d
         */


        char ch;//initialization of character datatype.
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                // type casting follows.  int d = 96; --> char ch = (char)d; --> char ch = (char)(96); --> char ch = 'a'; --> 'a' at 96 integer value.
                ch = (char)(j + 96);  //96 added for alphabet capital start from a -> 96 to z -> 122.
                System.out.print(ch +" ");
            }
            System.out.println();
        }


    }

}
