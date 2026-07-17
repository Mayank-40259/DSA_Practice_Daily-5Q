import java.lang.*;


public class ArrayOfOtherDataTypes {


    // Program 08). : -
    
    // Ques 07). Print the minimum element in the array of other data types.


    public static void main(String[] args) {
        // double[] arr = new double[8]; //double me by default value hoti hai zeo-by-zero --> 0.0 .

        // yaad hai --> '\n' --> nayi line me jaate the hm --> by enter.
        char ch = '\0'; //null character kahte the hm isko ya fir. 
        System.out.println((int)ch); // integer --> ascii value of --> '\0' --> 0 hoti hai hamari.
        // vice versa karte hain hm uska.
        int x = 0;
        System.out.println((char)x); // \0 print hoga hamara.


        // char[] arr = new char[8]; // kali aaya print hua kuch nahi sab khali.
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] + " ");

        // }

        String v = "Arpit is a bad boy";

        System.out.println(v);

        String[] arr = {"Abhinav","Harsh","Achyut","Sahil","Ishan"};
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        
        }

    }

}
