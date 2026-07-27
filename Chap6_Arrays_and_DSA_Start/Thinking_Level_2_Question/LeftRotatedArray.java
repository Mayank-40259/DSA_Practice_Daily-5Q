public class LeftRotatedArray {
    

    // Program 23). :-

    // Ques 17). Rotated array --> b).Left Rotated Array.
    // #problem no --> leetcode 189.
    // int[] arr = {10, 20, 30, 40, 50}


    // sahi Logic Left Rotation. --> {30, 40, 50, 10, 20};
    public static void rotate(int[] arr, int d){
        int n = arr.length;
        d = d % n;

        // Step 1). Pehle d elements ko reverse karo.
        reverse(arr, 0, d-1);

        // Step 2). Bacha hua part (d se n-1) ko reverse karo.
        reverse(arr, d, n-1);

        //  Step 3). Poore array ko reverse karo.
        reverse(arr, 0, n-1);

    }

    public static void reverse(int[] arr, int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int d = 2;

        System.out.print("Before Rotation of  Array : ");

        // Before Rotated Array.
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();


        // Rotate method call kiya.
        rotate(arr, d);


        // After Roated array.
        System.out.print("After Right Rotated Array : ");
        printArray(arr);

    }


    public static void printArray(int[] arr){

        for(int ele : arr){
           System.out.print(ele + " ");
        }
        System.out.println();

    }


}
