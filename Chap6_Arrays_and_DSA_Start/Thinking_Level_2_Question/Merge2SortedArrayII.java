import java.lang.*;
import java.util.Arrays;

public class Merge2SortedArrayII {
    
    // Program 31). :- merge 2 sorted arrays in a single big array without using any extra space.

    // part 2. of Ques 24. 

    // Question 24). :- Merge two-(2) Sorted Arrays without using any extra space. 
    // logic --> arr1 and arr2 ko jodo ek array me and fir sor kr do 
    // pure array ko ya sath hi saath me sort karte jaao pure array ko.
    // 
    // arr1 = {2, 5, 6, 9}; and arr2 = {1, 3, 4, 5, 7, 8}; 
    //  |                     |
    // arr = {2, 5, 6, 9, 1, 3, 4, 5, 7, 8};
    //  | -> sort karte jaao pure array ko. --> using minimum element logic.
    // arr = {1, 2, 3, 4, 5, 5, 6, 7, 8, 9};
    // 



    public static void merge(int[] arr, int[] arr1, int[] arr2){
        int i = 0, j = 0, k = 0;


        // 
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                arr[k++] = arr[i++];
               // arr[k] = arr1[i]; // yahan pr pehle vo print ho raha hai and baad me vo badh raha hai. --> toh hm isko likenge  --> arr[k++] = arr1[i++] --> use of post increment --> pehle i print hoga and sath hi sath vo badh jata hai aage iteration.
              //  i++;
               // k++; //yaha bhi k++ badh raha hai 
            }
            else{
                arr[k++] = arr2[j++];
                // arr[k] = arr2[j];
                // j++;
              //  k++; // yahan bhi k++ badh raha hai.
            }
            //  k++; //common le leinge hm isko bahar nikal lenge .

           // if(i == arr1.length){  // a array khatam -> b ke bache hue elements lo.
                while(i < arr1.length){
                    arr[k++] = arr1[i++];
                }
          //  }

          //  else{    // b array khatam -> a ke bache hue elements lo. --> (j == arr2.length) <-- ye follow hoga yahan pr.
                while(j < arr2.length){
                    arr[k++] = arr2[j++];
                }
           // }



        }
    }


    public static void main(String[] args){
        // three pointers approach to merge two sorted arrays without using any extra space.

        // Array Initialization.
        int[] arr1 = {2, 5, 6, 9, 20};
        int[] arr2 = {1, 3, 4, 5, 7, 8};

        //merge wala resultant array.
        int[] arr = new int[arr1.length + arr2.length];
        for(int ele : arr){
            System.out.print(ele + " ");
        }

        System.out.println();


        merge(arr,arr1,arr2);

        Arrays.sort(arr);

        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
