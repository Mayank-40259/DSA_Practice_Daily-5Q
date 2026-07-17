import java.lang.*;



public class PassingArrayToMethod {

    // Program 09). : -

    // Ques 08). Print passing the Array to Function and Methods.


      //initialization me hm likhenge --> int[] arr as reference variable and uske baad hm usko pass karenge method me as argument.
      public static void change(int[] y){  //ye modified,change, and updated value ko return karega hmara.
        // ish wajah se hmne yaha par int[] y likha hai as reference variable.
        // ish wajah se hme yaha pr int[] x bhi likh sakte the as reference variable but hmne yaha pr int[] y likha hai as reference variable.
        // x = 20;
        y[2] = 99;

    }


    public static void main(String[] args) {
        // int x = 10;
        int[] arr = {10, 3, 29, 38};
        System.out.println("arr change se pehle wala : " +arr[2]); // 29 print hoga hmara.
        change(arr);
       
        System.out.println("arr change se baad wala : " +arr[2]); // 99 print hoga hmara.


    }

}
