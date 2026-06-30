import java.lang.*;
import java.util.*;

public class Swappingxor {

    //Swapping of two number 
    //3rd method through xor ^ sign 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number m : ");
        int m = sc.nextInt();
        System.out.print("Enter the second number n : ");
        int n = sc.nextInt();

        System.out.println("m = "+ m +"  "+"n = "+n);

        m = m ^ n;
        n = m ^ n;
        m = m ^ n;

         System.out.println("m = "+ m +"  "+"n = "+n);

    }

}
