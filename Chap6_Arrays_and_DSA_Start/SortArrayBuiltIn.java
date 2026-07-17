import java.lang.*;
import java.util.Arrays;


public class SortArrayBuiltIn {


    // Program 11). : -

    // Ques 10). Sort an Array using Built-in method. (Arrays.sort(arr);)

    // sort :- it means arrangement of elements in a particular order of an array. it can be ascending or descending order.


    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {4, 1, 7, 5, -3, 10, 2};
        System.out.print("Before sorting : "); //before sorted array.
        print(arr);
        Arrays.sort(arr); //ye built in array hai jiska package hai Arrays ke saath. ye Arrays.sort method ka use karke hum sort kar sakte hain.
        System.out.print("After sorting : ");   //after sorted array.
        print(arr);

    }

}
