import java.lang.*;
import java.util.*;


public class NegativeArray {

    // Program 03). : -
    
    // Ques 2).Print negative numbers from arrays.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // size of array ka input.
        System.out.print("Enter the array size : ");
        int n = sc.nextInt();

        //array initialization.
        int[] arr = new int[n];

        // arrays elements input taken from users.
        System.out.print("Enter Array Elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        //printing negative values.
        // no. of array elements kitne bhi daal do vo keval negative hi consider karega.
        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
              System.out.print(arr[i] + " ");
            }
        }


    }
}
