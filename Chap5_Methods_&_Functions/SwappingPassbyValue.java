import java.lang.*;
import java.util.*;


public class SwappingPassbyValue {

    //Swapping ke under hai pass by value and pass by reference ka concept.
    //pass by reference pr nahi hota --> java ka code.
    //1).pass by value --> 

    public static void swapping(int m, int n){
        m = m + n;
        n = m - n;
        m = m - n;

        System.out.println("m = " + m + "  " + "n = " + n + " Swapping function");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    

        System.out.print("Enter the first number m : ");
        int m = sc.nextInt();
        System.out.print("Enter the second number n : ");
        int n = sc.nextInt();

        System.out.println("m = " + m + "  " + "n = " + n);

        swapping(m,n);

        System.out.println("m = " + m + "  " + "n = " + n + " Main Function"); //no change of value because of m and n is printed of main function vo jaa nahi raha hai to function
        //pr vo jaa raha hai abhi dekhna code me badlav.

    }

}
