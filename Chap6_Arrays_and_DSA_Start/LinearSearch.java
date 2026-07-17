import java.lang.*;
import java.util.*;


public class LinearSearch {


    // Program 14). : -

    //Ques 12). a).Linear Search Array.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n : ");
        int n = sc.nextInt();

        // initialization of array.
        int[] arr = {12, 3, 27, 53, 18, 62, 88, 6, 53}; 

        boolean flag = false; //false means target-->input value array me nahi hai.

        // taking n as input number from user to match this number in array.
        

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                flag = true; //true means target-->input value array me hai.
                break;
            }

        }
        if(flag == true){
            System.out.println("Target exists in Array.");
        }
        else{
            System.out.println("Target missing in Arrays.");
        }


    }

}
