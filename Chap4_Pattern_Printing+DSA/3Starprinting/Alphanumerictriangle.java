import java.lang.*;
import java.util.*;

public class Alphanumerictriangle {

    //Program 18). : - print the triangle shape with alphabeta and numbers pattern.


    /*
  1  1          <-odd
  2  A B        <-even
  3  1 2 3      <-odd
  4  A B C D    <-even
  5  1 2 3 4 5  <-odd
  6  A B C D E F <-even
    */



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows m : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of rows n : ");
        int n = sc.nextInt();


        char ch;
        if(m == n)
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= i; j++){
                if(i%2 != 0){
                    System.out.print(j + " "); //column-wise-same print j --> row wise same print i.
                }else{
                    ch = (char)(j + 64); //typecasting (j+64) column wise same print.--> ch -> 65 start. --> ro wise same print i+64;
                    System.out.print(ch + " ");
                }
            } 
            System.out.println();
        }


    }
}
