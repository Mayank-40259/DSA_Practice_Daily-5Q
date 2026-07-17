import java.lang.*;
import java.util.*;


public class ProductOfElement {


    // Program 05). : -
    
    //Ques 04). Print the product of elements of the Array.
    //1).given int[] arr = {-6, 8, 14, -2, 23, 47, -7};
    //2). user taken input.



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 1).given array initialized.
        int[] arr = {-6, 8, 14, -2, 23, 47, -7};


        int product = 1; //0 liya toh sab zero aayega 
        // ish vajah se 1 lenge kyuki kisi ka multiply 1 me karo toh vahi value aati hai.
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0)
            product = product * arr[i];
        }
        System.out.println("product of arrays is given in question : " + product);

        System.out.println();


        // 2).user taken input.


        // size of array ka input.
        System.out.print("Enter the size of an Array : ");
        int n = sc.nextInt();


        //array ka initialization.
        int[] arr1 = new int[n];


        // arrays ke elements ko hm input lenge from user.
        System.out.print("Enter the elements of arrays : ");
        for(int i = 0; i < n; i++){ //ab jo n hoga vaha tak ke input le sakte hain hm.
            arr1[i] = sc.nextInt();
        }


        // ye product karenga.
        int product1 = 1;
        for(int i = 0; i < n; i++){
            product1 = product1 * arr1[i];
        }
        System.out.println("product of arrays input from users : "+product1);


    }

}
