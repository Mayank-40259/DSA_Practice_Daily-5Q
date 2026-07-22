import java.lang.*;

public class ForEachLoop {


    // for each loop ka example.


    public static void main(String[] args) {

        // array initialize : -
        int[] arr = {5, 8, 2, 6, 9};

        System.out.println("For Loop");
          // for loop :-
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println();

        // for - each loop : -
        // syntax --> for(int any_variable_name :->(means->in) arr_name){
        //     /<-- Statements & Codes -->/;
        //   }
        // generally at variable in arrays --> ele.
        // isse bhi hm array ko traverse kr sakte hain.
        // 

        // isme print toh kr loge aap array ke elements ko 
        System.out.println("For-each Loop");
        for(int ele : arr){
            System.out.print(ele + " ");
        }

        System.out.println();
        System.out.println();

        // pr change nahi kr paaoge aap like multiply every element of the array by 2 .

        System.out.println("Multiply or change karenge for-each loop se");
        // for-each se multiply karenge hm.
        // for(int ele : arr){
        //     ele *= 2;
        // }
        // koi asar nahi hua jaisa array arr tha vesa hi print ho gaya bs.
        // --> (ele) se yahan pr array ke element ki ek copy banti hai bs or kuch nahi hota hai.
        // bs element ko print karne ke kaam aata hai ye.
        // -->(Doubt??) --> original array me koi change nahi hota hai.


        //for-each se kuch farak nahi hua array pr toh hmne fir for loop ko apply kiya.
        for(int i = 0; i < arr.length; i++){
            arr[i] *= 2;
        }

        // for printing element of the array.
        for(int ele: arr){
            System.out.print(ele + " ");
        }

        
    }
}
