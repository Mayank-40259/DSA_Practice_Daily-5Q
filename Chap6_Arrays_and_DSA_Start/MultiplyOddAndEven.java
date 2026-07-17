import java.lang.*;


public class MultiplyOddAndEven {


    // Program 12). : -

    // Ques 11). Multiply Odd and Even numbers in an arrays.
    //  --> Multiply odd indexed elements by 2 and add 10 to even indexed elements in an array.



    public static void main(String[] args){

        int[] arr = {10, 20, 30, 40, 50, 60};
        
        System.out.print("Upgraded array odd index multiplied by 2 & even index added by 10 : ");
        
        for(int i = 0; i < arr.length; i++){

            if((i%2) == 0){ //for even indices.
                arr[i] = arr[i] + 10;
                System.out.print(arr[i] + " ");
            }
            else if((i%2) != 0){  // for odd indices.
                arr[i] = arr[i] * 2;
                System.out.print(arr[i] + " ");
            }
           System.out.print(" ");
        

        }
        System.out.println();


    }

}
