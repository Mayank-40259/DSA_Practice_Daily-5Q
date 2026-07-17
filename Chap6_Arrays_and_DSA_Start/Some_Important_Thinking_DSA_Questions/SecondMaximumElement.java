import java.lang.*;


public class SecondMaximumElement {


    // Program 17). : -

    // Ques 16). : - Print the second Maximum element in the array.
    // method 1). basic approach.
    // method 2). developer approach.
    // 

    public static void main(String[] args) {
        int[] arr = { 4, 10, 10, 6, 3, 8};
        int max = 10;
        int Smax = 8;

        System.out.print("Arrays ke Second Maximum element : ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max || arr[i] == Smax){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

}
