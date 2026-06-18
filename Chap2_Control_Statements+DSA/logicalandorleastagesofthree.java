package Chap2_Control_Statements;
import java.util.Scanner;

public class logicalandorleastagesofthree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double ram,shyam,ajay;
        System.out.println("Enter the age of ram : ");
        ram = sc.nextDouble();
        System.out.println("Enter the age of shyam : ");
        shyam = sc.nextDouble();
        System.out.println("Enter the age of ajay : ");
        ajay = sc.nextDouble();

        if(ram < shyam && ram < ajay){
            System.out.println("ram is youngest : " +ram);

        }
        else if(shyam < ram && shyam < ajay){
            System.out.println("shyam is youngest : " +ajay);

        }
        else{
            System.out.println("ajay is youngest : " +ajay);

        }
        
    }

}
