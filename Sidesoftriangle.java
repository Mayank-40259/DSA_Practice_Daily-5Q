import java.util.Scanner;

public class Sidesoftriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Three given number be a side of triangle. 
        int a,b,c;
        System.out.println("enter the a :");
        a = sc.nextInt();
        System.out.println("enter the b :");
        b = sc.nextInt();
        System.out.println("enter the c :");
        c = sc.nextInt();
        //in case of triangle we have two sides sum is more than its 3rd side. 3 + 4 > 5 --> 7 > 5.
        if(a+b>c && b+c>a && a+c>b){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Invalid Triangle");
        }

    }

}