import java.lang.*;
import java.util.Scanner;


public class SwapNumbers {


    //Swapping two numbers program;
    //two numbers ko input leke fir exchange karado unki values ko a ki b me and b ki a me is called swapping of numbers.



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.print("Enter the First number m : ");
       int m = sc.nextInt();
       System.out.print("Enter the Second number n : ");
       int n = sc.nextInt();

        System.out.println("m = "+ m + "   "+"n = " + n);

        //two methods hote hain 1).we made temp variable.
        
        int temp = m;
       m = n;
       n = temp;

       System.out.println("m = "+m + "   " +"n = "+ n);

    }

}
