package Chap2_Control_Statements;
import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b;
        System.out.println("Enter the number b is : ");
        b = sc.nextInt();
        
        if(b%5 == 0){
            System.out.println(" b is divisible by 5 ");
        }
        else{
            System.out.println(" b is not divisible by 5 ");

        }

    }

}
