import java.lang.*;
import java.util.*;


public class StarSquare{

    //Program 1) : - 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        //Taking inputs m & n : -
        System.out.print("Enter the no. of rows & columns : ");
        int m = scanner.nextInt(); //taking input m as rows.
        int n = scanner.nextInt(); //taking input n as columns.
        
        //logic to print stars in Square form is m as rows == n as column : - 

        if(m == n){
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("* "); //always print for without next line.
            }
            System.out.println();
        }
     }


    }
}
