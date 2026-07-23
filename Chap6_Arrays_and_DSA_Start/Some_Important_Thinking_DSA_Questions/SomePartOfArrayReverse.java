import java.util.Arrays;


public class SomePartOfArrayReverse {


    // Program 21). :-

    // Ques 16). Between elements reverse in an array.


    public static void main(String[] args) {
        // Ek simple array banaya jisme 7 elements hain
        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        // Kahan se kahan tak reverse karna hai, wo index set kiya
        int start = 2; // Matlab 30 se shuru hoga
        int end = 5;   // Matlab 60 tak chalega

        System.out.println();
        // Reverse karne se pehle array ko print kiya
        System.out.println("Reverse karne se pehle:");
        System.out.println(Arrays.toString(arr));
        
        System.out.println("-----------------------------------------");

        // Loop tab tak chalega jab tak start index end se chhota hai
        while (start < end) {
            // Element ko temporary variable 'temp' mein save kiya
            int temp = arr[start];
            
            // End wale element ko uthakar Start par rakh diya
            arr[start] = arr[end];
            
            // Temp mein save kiya hua element End par rakh diya (Swap complete)
            arr[end] = temp;

            // Start pointer ko ek kadam aage badhaya
            start++;
            
            // End pointer ko ek kadam peeche laya
            end--;
        }

        // Reverse hone ke baad final array ko print kiya
        System.out.println("Reverse karne ke baad:");
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

}



