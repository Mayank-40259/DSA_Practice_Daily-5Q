import java.util.Scanner;

public class Divisibleand {
    public static void main(String[] args){
        //Q).Check if given number is divisible by 3 and 5.
        // && --> logical AND.
        Scanner sc = new Scanner(System.in);
        double num;
        System.out.println("Enter the num :");
        num = sc.nextDouble();
        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("Your num is divisible by 3 and 5");
        }
        else{
            System.out.println("Your num is not divisible by 3 and 5");
        }
    }

}
