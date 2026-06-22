import java.lang.*;
import java.util.*;



public class Numbersameinrow {


    //Program 5). :-

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of row's m : ");
        int m = sc.nextInt();
        System.out.print("Enter the no. of column's n : ");
        int n = sc.nextInt();

        //logic of program :-

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                System.out.print(i + " ");

            }
            System.out.println();
        }
    }

}
