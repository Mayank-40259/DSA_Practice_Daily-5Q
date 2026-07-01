import java.lang.*;
import java.util.Scanner;


public class ChangeXvalue {


    //as an example of pass by value.

    public static void change(int x){
        x = 20;
        System.out.println(x + " Change function");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the first number x : ");
        int x = sc.nextInt();

        System.out.println(x);

        change(x);

        System.out.println(x + " Main function");



    }
}
