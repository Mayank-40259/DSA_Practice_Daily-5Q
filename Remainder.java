import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dividend,divisor,quotient,remainder;
        System.out.println("Enter the Dividend : ");
        dividend = sc.nextDouble();
        System.out.println("Enter the Divisor :");
        divisor = sc.nextDouble();
        // System.out.println("Enter the Quotient :");
        // quotient = sc.nextDouble();
        quotient = dividend/divisor;
        remainder = dividend - divisor*quotient;
        System.out.println("Your Quotient is :" +quotient);
        System.out.println("Your remainder is : " +remainder);

    }

}
