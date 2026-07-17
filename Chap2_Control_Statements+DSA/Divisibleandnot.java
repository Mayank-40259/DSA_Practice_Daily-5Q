package Chap2_Control_Statements;
import java.util.Scanner;

public class Divisibleandnot {
    public static void main(String[] args){
        //Q).Check if given number is divisible by five but not three.
        // ! --> logical not.
        
        Scanner sc = new Scanner(System.in);
        double num;
        System.out.println("Enter the num");
        num = sc.nextDouble();
        if(num % 5 == 0 && num % 3 != 0){
            System.out.println("Your num is divisible by 5 but not 3");
        }
        else{
            System.out.println("Your num is divisible by 3 but not 5");
        }

    }

}
