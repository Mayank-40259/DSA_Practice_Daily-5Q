import java.lang.*;
import java.util.*;


public class NumberSquare{

    //Program 3) : - column wise same number printing.

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the no. of row's & column's : ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        //logic as -->
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= m*n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }



    }

}
