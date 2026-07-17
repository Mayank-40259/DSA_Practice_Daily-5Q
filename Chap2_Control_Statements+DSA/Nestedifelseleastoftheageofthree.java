package Chap2_Control_Statements;
import java.util.Scanner;

public class Nestedifelseleastoftheageofthree {
    public static void main(String[] args){

        //Check if the least ages of three given number using nested if else.
        Scanner sc = new Scanner(System.in);
        double ram,shyam,ajay;

        System.out.println("Enter the age of ram : ");
        ram = sc.nextDouble();
        System.out.println("Enter the age of shyam : ");
        shyam = sc.nextDouble();
        System.out.println("Enter the age of ajay : ");
        ajay = sc.nextDouble();

        if(ram < shyam){
            if(ram < ajay){
                System.out.println("ram is youngest : " +ram);
            }
            else{
                System.out.println("ajay is youngest : " +ajay);
            }
        }
        else{
            if(shyam < ajay){
                System.out.println("shyam is youngest : " +shyam);
            }
            else{
                System.out.println("ajay is youngest : " +ajay);
            }

        }
        
    }

}
