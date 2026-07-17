import java.lang.*;
import java.util.*;

public class OutputInputArray {


    // Lec-01 Arrays 
    //Program 02). : - 


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = {5, -8, 2, 7, 34, 50}; 
        // int[] arr = {4, -9, 2, 67, 43, -97, 6, 23, 89};

        // System.out.println(arr.length);

        // int n = arr.length;

        // System.out.println();

        //--1). using for loop to print an array.
        //  for (int i = 0; i < n; i++) { //index - 0 to n - 1.  //array ki length hai 6 six. --> last term of loop is  i <= 5 as indexing of element (length-1=indexing) and i < 6.
        //     System.out.println(arr[i] + " ");
        // }

        // System.out.println();

            //--2). using while loop to print an array.
            // initialization or starting of indexing.
        // int i = 0;
        // while(i <= 5){ 
        //     System.out.println(arr[i] + " ");
        //     i++;
        // }

        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);
        // System.out.println(arr[5]);

     //Second --> array banate hain ab hm.
        //  reference hai Karan --> oops se dekhe toh object hai.
        int[] karan = new int[7]; // array khali create hogi with index 0 to 6 and 7 elements are present in their but all at printing is 0.
        // for(int i = 0; i<7; i++){
        //     System.out.print(karan[i] + " "); // 0 0 0 0 0 0 0.
        // }

        // input : -
        // arrays ke ander ke elements ko hm input kaise lenge --> arr = {3, 4, 8, 90, 34};

        for(int i = 0; i < 7; i++){
        //    int x = sc.nextInt();
        //    karan[i] = x;
        //    or
        karan[i] = sc.nextInt();

        }
        // print
         for(int i = 0; i<7; i++){
            System.out.print(karan[i] + " "); // jo digit hm input lenge vo hi print hongi.
        }
        System.out.println();
        // multiple of 2 in every element of an arrays.
        for(int i = 0; i<7; i++){
            System.out.print(2*karan[i] + " ");
        }

       
    }


}
