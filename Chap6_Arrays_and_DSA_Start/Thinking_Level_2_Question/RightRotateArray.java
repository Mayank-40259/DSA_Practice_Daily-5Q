import java.lang.*;

public class RightRotateArray {

    // Program 22). :-

    // Ques 17). :- Rotated Array --> a).Right Rotated Array . && b).Left Rotated Array.
    // #problem no --> 189 at leetcode.


    // Sahi Logic (Right Rotation)
    public static void rotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // Faltu rotations ko rokne ke liye

        // Step 1: Poore array ko reverse karo
        reverse(arr, 0, n - 1);
        
        // Step 2: Pehle d elements ko reverse karo
        reverse(arr, 0, d - 1);
        
        // Step 3: Bacha hua part (d se n-1) ko reverse karo
        reverse(arr, d, n - 1);
    }

    // reverse ko static banaya aur return type void kiya
    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 8, 1, 2, 4, 9, 5};
        int d = 3;

        System.out.print("Before Rotation of Array : ");
        printArray(arr);

        // Rotate function call kiya
        rotate(arr, d);

        System.out.print("After Right Rotated Array : ");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
