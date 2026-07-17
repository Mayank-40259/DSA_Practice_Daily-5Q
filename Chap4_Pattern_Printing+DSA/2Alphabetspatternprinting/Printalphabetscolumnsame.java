import java.lang.*;
import java.util.*;


public class Printalphabetscolumnsame {
    

    //Program  7).  : - print capital alphabets column-wise same.


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.print("ENTER THE NUMBER m AS ROWS : ");
        int m = sc.nextInt();
        System.out.print("ENTER THE NUMBER n  AS COLUMNS : ");
        int n = sc.nextInt();

        //Logic of program : -

        /* Pattern in.
        A  B  C  D
        A  B  C  D
        A  B  C  D
        A  B  C  D
         */


        char ch; //initialization of character datatype.
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                // type casting folows.  int d = 65; --> char ch = (char)d; --> char ch = (char)(65); --> char ch = 'A'; --> 'A' at 65 integer value.
                ch = (char)(j+64);  //64 added for alphabet capital start from A -> 65 to Z -> 96.
                System.out.print(ch + " ");
            }

            System.out.println();

        }

    }
}
