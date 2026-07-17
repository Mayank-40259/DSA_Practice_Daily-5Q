import java.lang.*;

public class ReverseAnArray {


    // Program 15).

    // Ques 14). : - Write a program to reverse the array without using any extra array.
    // 
    // arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29}
    //    |- reverse.
    // arr = {29, 23, 19, 17, 13, 11, 7, 5, 3, 2}
    // 
    // method 1). very simple approach pr galat hai reverse the loop. last element ko jo pehle me first tha ushe likhna hota hai bs.
    // method 2).
    // method 3).
    // 
    // 


    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

        System.out.print("Reverse se Pehle wala Array : {");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("}");
        
        System.out.println();
        System.out.println();
        System.out.print("Reverse ke baad wala Array : ");
 
        int n = arr.length;
        System.out.print("{");
        for (int i = n-1; i >= 1; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.print("2 }");
    }
}
