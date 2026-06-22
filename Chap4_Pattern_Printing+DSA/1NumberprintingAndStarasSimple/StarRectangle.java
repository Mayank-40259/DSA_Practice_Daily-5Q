package NumberprintingAndStarasSimple;
import java.lang.*;
import java.util.*;


public class StarRectangle {

    //Program 2) :-
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Taking inputs m and n 
        System.out.print("Enter the number n : ");
        int m = scanner.nextInt(); // taking input m as rows.
        System.out.print("Enter the number m : ");
        int n = scanner.nextInt(); // taking input n as columns.

  
        //for rectangle use rows as (n) less < column as (m) more.

        for(int i = 1; i <= m; i++){  // i component as matrix rows --> m as rows
            for(int j = 1; j <= n; j++){ // j component as matrix columns--> n as columns.
                System.out.print("* "); //print star without next line through --> print.
            }
            System.out.println();//next line print.
        } 


    }
}
