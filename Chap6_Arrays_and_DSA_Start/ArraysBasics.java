import java.lang.*;


public class ArraysBasics {

    // Lecture - 01 of Arrays 
    // Program-01 : -


    public static void main(String[] args) {

        // int x1 = 6;
        // int x2 = 19;
        // int x3 = 7;
        // int x4 = 69;
        // int x5 = 9;
        // int x6 = 171;
        // int x7 = 5;

     //1).Array ko initialize karne ka 1st Method : -

        // // hame ye saare numbers ek hi baaari me likhne hain toh hm kkya karenge ab.
        // int[] x  = {6, 19, 7, 69, 9, 171, 5};
        // // indexing 
        // // x naam ki array hai ek uske ander same type ka data hai int[] .
        // // System.out.println(x); //[I@7ad041f3 --> address of an array --> aage batayenge kya print hua ye.

        // System.out.println(x[0]); // x[0] --> 6 pr kya value hai x array ke ander 0th index pr kya value hai usko point karega --> 6 hai print hoga six.
        // System.out.println(x[5]); // x[5] --> 171 value .

        // // updating elements - mutability.
        // x[3] = 89;
        // System.out.println(x[3]);

        //2).Array ko initialize karne ka 2nd Method : -
        // use of new keyword.

        int[] arr = new int[4]; //4 size ka array --> 4 hi element aa sakte hain ishme || 0 to 3 hi iske indexs ho sakte hain.

        // try {
            
        
        
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 60; // nahi jayega ye iske ander.
        arr[5] = 70; // nahi jayega ye iske ander.



        // } catch (Exception e) {
        //     System.out.println("ArrayIndexOutOfBoundsException");
        // }
        

    }


}
