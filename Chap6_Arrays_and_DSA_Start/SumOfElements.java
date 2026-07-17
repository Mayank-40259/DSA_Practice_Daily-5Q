import java.lang.*;
import java.util.*;


public class SumOfElements {



    // Program 04). : -

    // Ques 03).Print sum of elements of the array.
    // a). user taken array.
    // b). int[] arr = {-6, 8, 14, -2, 23, 47, -7};
    // and check maximum and minimum elements of the array.



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        // size of array ka input.
        System.out.print("Enter the size of an Array : ");
        int n = sc.nextInt();


        //1).array initialization.
        int[] arr = new int[n];

        

        // arrays elements input taken from users.
        System.out.print("Enter Array Elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }


        //printing sum of elements of array.
        // no. of array elements kitne bhi daal do vo keval negative hi consider karega.
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
        }

        System.out.print("Sum of taken by user Array : " + sum);
    

        System.out.println();


        // 2).arrays according to question initialization.
        int[] arr1 = {-6, 8, 14, -2, 23, 47, -7};
        int sum1 = 0;
        for(int i = 0; i < arr1.length; i++){
            sum1 = sum1 + arr1[i];
        }
        System.out.println("sum of Array given in question : " +sum1);


    }

}
