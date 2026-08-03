import java.lang.*;
import java.util.Scanner;


public class AddingSumOfArraysInToOne {

    //Program 28). :- Adding Sum Of Two Arrays In To One Resultant Array. 

    // Question 23). :- Adding Sum Of Arrays In To One Resultant Array.


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        // First Array : -
        System.out.print("Enter the size of First array : ");
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        System.out.print("Enter the elements of the First Array : ");
        for(int i = 0; i < m; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Your Taking Arrays element of First Array is : ");
        for(int ele : arr1){
            System.out.print(ele + " ");
        }

        System.out.println();


        // Second Array : -
        System.out.print("Enter the size of Second Array : ");
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        System.out.print("Enter the elements of the Second Array : ");
        for(int i = 0; i < n; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.print("Your Taking Arrays element of Second Array : ");
        for(int ele : arr2){
            System.out.print(ele + " ");
        }


        System.out.println();


        System.out.print("Your Resultant array through addition of elements is : ");
        int p = arr1.length + arr2.length;
        int[] arr = new int[m + n];


        // Loop to assign the value in one resultant array.
        for(int i = 0; i < m; i++){
            arr[i] = arr1[i];
        }
        for(int i = 0; i < n; i++){
            arr[m + i] = arr2[i];
        }

        // Printing array 
        for(int ele : arr){
            System.out.print(ele + " ");
        }

       // ArrayList<Integer> resultArray = new ArrayList<>(); in Program 29).

    }
}
