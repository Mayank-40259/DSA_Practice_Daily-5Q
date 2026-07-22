import java.lang.*;


public class ReverseIIArray {
    


    // Program 16). : -

    // Ques 14). : - Write a program to reverse the array without using any extra array.
    // 
    // arr = {6, 8, 1, 2, 4, 9, 5}
    //    |- reverse.
    // arr = {5, 9, 4, 2, 1, 8, 6}
    // 
    // method 1). ishe Ques 14). me kr diya and program 15). me khatam kr diya hm ne.
    // method 2). using second array.
    // method 3). swapping elements from both ends of the array. (best approach)


    // # Concept for each loop : -
    // a). it is used to traverse the data structures.
    // b). it cannot modify array elements.
    // ex : - in folders ForEachLoop.java file read and run the code.
    // bs array ko print karne ke kaam aata hai ye loop type --> for-each loop.
    // 

    // using two variable &
    // pointer technique.

    // karna kya hai
    // 1).
    // 
    // 
    // 

    // public static int[] swap(arr[i] , arr[j]){
    //     int temp = i;
    //     i = j
    //     j = temp;
    // }


    public static void main(String[] args) {

        //using second array.
        int[] arr = {6, 8, 1, 2, 4, 9, 5};
        int n = arr.length;

        // original array printing.
        System.out.print("Original Array Before Reverse : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // reverse wala array printing.
        System.out.print("Reverse Array After Reverse : ");
        int i = 0;
        int j = n-1;// index ki tarah kaam karega ye ab i-1 = index-length.

        // 
        // 
        //        0   1   2   3   4   5   6 
        //      -----------------------------
        //  arr | 6 | 8 | 1 | 2 | 4 | 9 | 5 |
        //      -----------------------------
        //        |                       |
        //        i -->               <-- j
        // 
        // 


        // jb tak takra na jaaye tab tak do number ko i --> aage le jaao and j ko <--j peeche lekar aao.
        //1).Swapping se hoga :
        // int a,b;
        // temp = a; //temp pehle a ko dega apni value.
        // a = b; //a ki value b me chali gayi and 
        // b = temp; // b ki value a me hi jayegi kyuki temp pehle a ko dega apni value.
        //while - loop use.
       while(i <= j){
        // swap(arr[i], arr[j]); //function nhi bana rahe swapping ka bs likha hai samjhane ke liye.
          int temp = arr[i];  //i --> j;
           arr[i] = arr[j];   
           arr[j] = temp;    //j --> i;
           i ++;
           j --;

        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
        



}


