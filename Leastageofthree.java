import java.util.Scanner;

public class Leastageofthree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double ram,shyam,ghanshyam;

        System.out.println("Enter the age of Ram");
        ram = sc.nextDouble();
        System.out.println("Enter the age of Ram");
        shyam = sc.nextDouble();
        System.out.println("Enter the age of Ram");
        ghanshyam = sc.nextDouble();

        if(ram < shyam && ram < ghanshyam){
            System.out.println("Ram is Youngest : " +ram+ " years old");
        }
        else if(shyam < ram && shyam < ghanshyam){
            System.out.println("Shyam is Youngest : " +shyam+" years old");
        }
        else{
            System.out.println("Ghanshyam is Youngest : " +ghanshyam+ " years old");
        }

    }

}
