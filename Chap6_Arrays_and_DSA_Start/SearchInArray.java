import java.lang.*;
import java.util.*;


public class SearchInArray {


    // Program 13). : -

    // Ques 12). Search in Array.
    // a).Linear - Search --> searches all elements.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // initialization of array.
        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter the number n : ");
        // input a number.
        int n = sc.nextInt();

        // check if the input number is in array yes or no.
        for(int i = 0; i < arr.length; i++){
            if(n == arr[i]){
                System.out.print("YES " + n + " is matches the Given array arr. at index " + i);
            }
            else if(n != arr[i]){
                System.out.print("NO " + n + " is not matches the Given array arr. at index " + i);
            }
            System.out.println();
        }

  
    }

}
