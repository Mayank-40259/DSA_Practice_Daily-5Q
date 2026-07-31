import java.lang.*;

public class SecondMaximumElementII {


    // Program. 20). : - 
    // Ques.). Second Largest GFG.
    // Logic :- min and max ki value ko minvalue se initialize karo and condition ke hisab se find karo ki kon max and Smax hoga.
    // 

    
    // Ques 15). : - Print the second Maximum element in the array.
    // method 2). developer approach.
    // 

    public static void main(String[] args){
        // array initialization
        int[] arr = { 4, 10, 10, 6, 3, 8};

        // max and smax initial value or initialization.
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        // storing index of the maximum values.
        int m; // for max ka index.
        int n; // for n ka index.

        // calculate max;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i]; //10
             
        }

        // calculate second max --> smax;
        for(int i = 0; i < arr.length; i++){ // agar ham not equal nahi karte max ke saath && operator se toh smax = 10 hi aata.
            if(arr[i] > smax && arr[i] != max) smax = arr[i]; //8.
             
        }

        System.out.println("Your maximum (max) element in array arr is : " + max);
        System.out.println("Your second max (smax) element in array arr is : " + smax);

    }

}
