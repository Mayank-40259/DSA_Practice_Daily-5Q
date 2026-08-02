import java.lang.*;
import java.util.Scanner;
import java.util.ArrayList;


public class AddingSumOfArraysInToOneII {
    

    // Program 29). : -

    // Ques 23). part -02 : - Adding Sum Of Arrays In To One Resultant Array using ArrayList.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

      //  System.out.print("Enter the size of First Array is : ");
        


        ArrayList<Integer> arr = new ArrayList<>();

        System.out.print("Enter the elements of the First Array is : ");
        for(int i = 0; i < arr.size(); i++){
            arr.get(i) = sc.nextInt();
        }
        System.out.println("Your taking element is : " + arr);
        


        System.out.println();


        System.out.print("Enter the size of Second Array is : ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];

        System.out.print("Enter the element of the Second array is :");
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
           
        }
         System.out.println("Your taking element is : " + arr1);
         


        
    }
}
