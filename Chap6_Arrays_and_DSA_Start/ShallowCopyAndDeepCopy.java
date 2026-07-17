import java.lang.*;
import java.util.Arrays;


public class ShallowCopyAndDeepCopy {


    // Program 10). : -


    // Ques 09). Print the Shallow Copy and Deep Copy of an Array.
        // shallow-copy -> maine actual copy nahi banayi 
        // mera naam mayank ek paper pe likha and ushi pr ankit likh diya toh me ush paper ko chahe mayank se bulau ya ankit se.
        // dono ushi paper ke address ko point kr rahe hain.



    public static void main(String[] args) {

        int z = 4; // 4 bytes leta hai ye memory me.

        // Shallow-Copy : -
        int[] shallow = {10, 20, 30, 40, 50}; //20 bytes leta hai ye memory me. //ye array ka address heap memory me store hota hai.
        int[] x = shallow; //x is shallow copy of arr.
        x[0] = 100;
        System.out.println("Shallow - Copy bolte hain hm isko : " + shallow[0]);

        // Deep-Copy : -

        // int[] deep = Arrays.copyOf(shallow, shallow.length); //deep copy. //same as shallow copy jaisa kiya tha int[] ykarke reference variable bhi likh sakte ho aap.
        // ye built in array hai jiska package hai Arrays ke saath. ye Arrays.copyOf method ka use karke hum deep copy kar sakte hain.
        int[] deep = {1, 2, 3, 4, 5, 6};
        int[] y = deep; //y is shallow copy of deep array.
        y[0] = 111;
        System.out.println("y array hai of deep ka deep-copy hai ye : " + y[0]);

        int[] y1 = Arrays.copyOf(shallow, shallow.length); //deep copy. --> purane array se hai.
        // deep[0] = 100;
        y1[0] = 10;
        System.out.println("y1 array of shallow wale ka deep copy : " + y1[0]);

        // System.out.println(deep[0]);

    }

}
