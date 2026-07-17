import java.lang.*;
// import java.util.*;


public class TwoSumArrays {


    // Program 15). : -


    // Ques 13). : - Print the sum of Two elements in Arrays.
    // ek array ke ander hi do elements ko uthao or unka addition ke target number ke barabar aaye.
    //  arr = {1, 5, 8, -3}
    //  target = 2; --> 



    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // taking array elements total no.'s.
        // System.err.print("Enter the number of elements of the array is n : ");
        // int n = sc.nextInt();

        // Array initiaalization : - 
       // int[] arr = new int[n];

        // for(int i = 0; i < arr.length; i++){
        //     arr[i] = sc.nextInt();
        //     System.out.print(arr[i] + " ");
        // }

        // galat approach.
        // int target = 10;
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = 1 ; j <= i; j++){
        //         if(arr[i] > 0)
        //             target = j + i;
        //         System.out.print(target + " ");
        //     }
        //     System.out.println();
        // }

        System.out.println();
        int[] arr = {2, 4, 5, 9};

        // Sahi approach.
        int target = 9;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(i + " & " + j + " are the indices of adding these inside stored values to gets Sum equals to its target.");
                }
            }

        }
        System.out.println();

    }

}
