import java.lang.*;
import java.util.*;


public class MinimumOfElement {


    //Program 07). : -
    
    //Ques 06). Print the minimum element in the array.



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] arr = {-1, 8, 14, -2, 23, 47, 4, 3, -10};

        // initialization of minimum element in an array.
        // starting element is arr[0] = -1;
      int min = arr[0];
        // Integer.MIN_VALUE;
        // int min = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min) min = arr[i];
        }
        System.out.print("minimum-number->element --> in this Array : " + min );


    }
   


}
