import java.lang.*;


public class WaveArray {


    //Program 25). :-

    //Ques 20). :- Wave Array.

    public static void convertToWave(int[] arr){
        for(int i = 0; i < arr.length; i += 2){
            if(i == arr.length - 1) break;
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }


    public static void convertToWavetwo(int[] arr1){
        for(int i = 0; i < arr1.length; i += 2){
            if(i == arr1.length - 1) break;
            int temp = arr1[i];
            arr1[i] = arr1[i + 1];
            arr1[i + 1] = temp;
        }
    }


    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {2, 4, 7, 8, 9, 10, 20};

        // Array 1 :-
        System.out.print("Before Wave Array is : ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }

        convertToWave(arr);


        System.out.println();


        System.out.print("After Wave Array is : ");
        printArray(arr);

        System.out.println();
        


        // Array2 : -
        System.out.print("Before Wave Array2 is : ");
        for(int ele : arr1){
            System.out.print(ele + " ");
        }

        convertToWavetwo(arr1);

        System.out.println();

        System.out.print("After Wave Array2 is : ");
        printArray1(arr1);

    }

    public static void printArray(int[] arr){
       for(int ele : arr){
         System.out.print(ele + " ");
       }
    }

    public static void printArray1(int[] arr1){
           for(int ele : arr1){
        System.out.print(ele + " ");
       }
    }
}
