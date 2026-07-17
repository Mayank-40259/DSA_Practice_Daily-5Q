import java.lang.*;
import java.util.*;


public class MaximumOfElement {


    //Program 06). : -

    //Ques 05). Print the Maximum element in the array.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {-6, 8, 14, -2, 23, 47, 4, 3, 10};

        //initialization of max element in array.
        // starting element is arr[0] = -6;
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        System.out.print("maximum-number->element --> in this Array : " + max );


    }

}
