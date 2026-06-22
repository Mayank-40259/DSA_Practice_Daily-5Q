import java.lang.*;
import java.util.*;


public class NumbersameinrowStarprint {

    //Program 6). :-


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        //Logic of program :- challenging question --> Star print karo iske.

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }


    }
}
