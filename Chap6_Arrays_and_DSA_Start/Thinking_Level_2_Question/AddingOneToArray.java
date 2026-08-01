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
        int n = arr.length;
        int carry = 1;
        for(int i = n - 1; i >= 0; i--){
            if(arr[i] + carry <= 9){
                ans.add(arr[i]+carry);
                carry = 0;
            }
            else{   // arr[i] + carry = 10; --> 0 niche likhte the 1 carry hota tha.
                ans.add(0);
                carry = 1;
            }
        }
        if(carry == 1) ans.add(1);
        Collections.reverse(ans);
        return ans;
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
        System.out.println("After Adding One To Array is : " +ans);


        System.out.println();


        // Second Array :-
        int[] arr1 = {5, 6, 7, 8};
        System.out.print("Before Adding One To Array is : ");
        for(int ele : arr1){
            System.out.print(ele + " ");
        }
        System.out.println();

        Vector<Integer> ans1 = obj.addOne(arr1);
        System.out.println("After Adding One To Array is : " +ans1);
    }
}

