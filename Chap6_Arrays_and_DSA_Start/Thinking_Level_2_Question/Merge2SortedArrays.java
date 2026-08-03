import java.lang.*;

public class Merge2SortedArrays {
    

    // Program 30). :- merge 2 sorted arrays in a single big array.

    // Question 24). :- Merge two-(2) Sorted Arrays. 
    // logic --> arr1 and arr2 ko jodo ek array me and fir sor kr do 
    // pure array ko ya sath hi saath me sort karte jaao pure array ko.
    // 
    // arr1 = {2,5,6,9}; and arr2 = {1,3,4,5,7,8}; 
    //  |                     |
    // arr = {2,5,6,9,1,3,4,5,7,8};
    //  | -> sort karte jaao pure array ko. --> using minimum element logic.
    // arr = {1,2,3,4,5,5,6,7,8,9};
    // 

    public static void main(String[] args){
        // Array Initialization.
        int[] arr1 = {2, 5, 6, 9};
        int[] arr2 = {1, 3, 4, 5, 7, 8};
        int[] arr = new int[arr1.length + arr2.length];

        for(int i = 0; i < arr1.length; i++){
            arr[i] = arr1[i];
        }
        for(int i = arr1.length + 1; i < arr2.length; i++){
            arr[i + 1] = arr2[i];
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }


    }
}
