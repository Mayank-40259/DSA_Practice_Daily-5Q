import java.lang.*;
import java.util.*;

public class Merge2SortedArrays {
    

    // Program 30). :- merge 2 sorted arrays in a single big array.

    //Part 1 of Ques 24. 

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
        // Array - 01 :- First Array.
        System.out.print("Your Taking Arrays element of First Array is : ");
        int[] arr1 = {2, 5, 6, 9};
        for(int ele : arr1){
            System.out.print(ele + " ");
        }

        System.out.println();

        // Array - 02 :- Second Array.
        System.out.print("Your Taking Arrays element of Second Array is : ");
        int[] arr2 = {1, 3, 4, 5, 7, 8};
        for(int ele : arr2){
            System.out.print(ele + " ");
        }

        System.out.println();

        // Array - 03 :- Resultant Array.
        int[] arr = new int[arr1.length + arr2.length]; // array banega ek memory me resultant array as arr jahan khali spaces honge with indexing from 0 to n-1 where n = arr1.length + arr2.length = 4 + 6 = 10.

        // total length of resultant array.
        int n = arr1.length + arr2.length;

        // first loop to assign the value of arr1 in resultant array.
        for(int i = 0; i < arr1.length; i++){
            arr[i] = arr1[i];
        }
        // second loop to assign the value of arr2 in resultant array.
        for(int i = arr1.length ; i < n; i++){ //arr1.length = 4 and arr.length ==> n = arr1.length + arr2.length = 4 + 6 = 10.
            arr[i] = arr2[i - arr1.length]; // i - arr1.length = 4 - 4 = 0; and i = 5 - 4 = 1; and i = 6 - 4 = 2; and i = 7 - 4 = 3; and i = 8 - 4 = 4; and i = 9 - 4 = 5;
        }

        // Printing the resultant array.
        System.out.print("Your Resultant array through addition of elements is : ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }

        System.out.println();

        // Sorting the resultant array.
        Arrays.sort(arr); // using Arrays.sort() method to sort the resultant array.
        System.out.print("Your Resultant array after sorting is : ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
