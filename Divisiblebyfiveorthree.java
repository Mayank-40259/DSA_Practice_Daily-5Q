import java.util.Scanner;

public class Divisiblebyfiveorthree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num;
        System.out.println("Enter the num");
        num = sc.nextDouble();
        // ||--> logical OR.
        if(num % 5 == 0 || num  % 3 == 0){
            System.out.println("Your num is divisible by 5 or 3");
        }
        else{
            System.out.println("Your num is not divisible by 5 or 3");
        }

    }


}
