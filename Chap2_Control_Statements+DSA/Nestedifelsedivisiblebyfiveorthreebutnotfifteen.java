package Chap2_Control_Statements;
import java.util.Scanner;

public class Nestedifelsedivisiblebyfiveorthreebutnotfifteen {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double num;
    System.out.println(" Enter the num : ");
    num = sc.nextDouble();

    if(num % 5 == 0 || num % 3 == 0){
        if(num % 15 != 0){
            System.out.println("num is divisible by 3 or 5 but not 15 : " +num);
        }
        else{
            System.out.println("num is not divisible by 3 or 5 but 15 : " +num);
        }

    }
    else{
        System.out.println("Not matching the condition : " +num);

    }

 }

}