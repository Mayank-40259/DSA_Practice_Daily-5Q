import java.lang.*;
import java.util.Collections;
import java.util.Vector;


public class AddingOneToArray {

    // Program 27). :- program and concept used of ArrayList .

    // Ques 22). :- Adding One To Array.
    // Logic : - is simple, we will start from 
    // the last index and add 1 to it, if it becomes 10 
    // then we will make it 0 and move to the previous index and add 1 to it.

    //Logic in hinglish :- hm array ke last index se start krenge aur usme 1 add krenge, agar wo 10 ho jata hai to usko 0 kr denge aur pichle index pr jaake usme 1 add krenge.

    Vector<Integer> addOne(int[] arr) {
        // code here
        Vector<Integer> ans = new Vector<>(); 
        int n = arr.length; //3 //4
        int carry = 1;
        for(int i = n - 1; i >= 0; i--){
            if(arr[i] + carry <= 9){
                ans.add(arr[i]+carry); // 8 + 1 = 9 last element.7 + 0 = 7, 6 + 0 = 6, 5 + 0 = 5 -->  [9,7,6,5]. with carry = 0;
                carry = 0;             // carry hogi zero. dusre iteration loop ke liye.
            }
            else{   // arr[i] + carry = 10; --> 0 niche likhte the 1 carry hota tha.
                ans.add(0); // store in ans arraylist --> [0, 0, 0]; with carry = 1;  dusre iteration loop ke liye.
                carry = 1;  // hamne carry ko 1 kr diya hai, kyuki 10 ho gaya tha.
            }
        }
        if(carry == 1) ans.add(1);  // [0,0,0,1] --> ans arraylist me 1 add kr diya hai, kyuki last me carry 1 bacha hua tha. 
        Collections.reverse(ans);  //reverse hoga pura arraylist ans.
        return ans;  //because of integer datatype.
    }

    public static void printArray1(int[] arr){
        System.out.print("After Adding One To Array is : ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }


    public static void main(String[] args){

        // First Array : -
        int[] arr = {9, 9, 9};
        System.out.print("Before Adding One To Array is : ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();

        AddingOneToArray obj = new AddingOneToArray();
        Vector<Integer> ans = obj.addOne(arr);
        System.out.println("After Adding One To Array is : " +ans); // 1, 0 , 0 , 0.


      //  System.out.println();


        // Second Array :-
        int[] arr1 = {5, 6, 7, 8};
        System.out.print("Before Adding One To Array is : ");
        for(int ele : arr1){
            System.out.print(ele + " ");
        }
        System.out.println();

        Vector<Integer> ans1 = obj.addOne(arr1);
        System.out.println("After Adding One To Array is : " +ans1); // 5, 6, 7, 9.
        
    }
}

