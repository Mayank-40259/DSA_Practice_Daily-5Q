import java.lang.*;
import java.util.*;


public class NumberasSquarestarprint {

    //Program 4) : - 


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the no. of rows and columns : ");
        int m = scanner.nextInt();
     //   int n = scanner.nextInt(); //

     //logic as -> 
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= i; j++){ // ek component column wala (n) hatana pada kyuki barabar printing nahi aati 3 by 3 ki as or number print honge j ke.
                System.out.print(j+" "); // number print honge j column component ke.
            }
            System.out.println();
        }



    }
}
