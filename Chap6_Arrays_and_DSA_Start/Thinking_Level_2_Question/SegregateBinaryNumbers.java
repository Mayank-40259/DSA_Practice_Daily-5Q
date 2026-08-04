import java.lang.*;


public class SegregateBinaryNumbers {


    // Program 24). :-

    // Ques 19). : - Segregate 0's and 1's.


    // method -02. // 
    public static void segregate0and1(int[] arr) {
        // code here
        // method-1 : short wala.
        // Arrays.sort(arr);
         
        //  method 2: forcefully zero and ones banana.
        // two pass solutions.
        //     int n = arr.length;
        //     int numberOfZeros = 0;
        //     int numberOfOnes = 0;
         
        //       for(int ele : arr){
        //          if(ele == 0) numberOfZeros++;
        //          else numberOfOnes++;
        //       }
         
        //         for(int i=0; i < numberOfZeros; i++){
        //          arr[i] = 0;
        //         }
         
        //         for(int i=numberOfZeros; i < n; i++){
        //          arr[i] = 1;
        //         }
         
        // }   

        // method -03 from two pointers technique.
        // method three is not best in some special condition 
        int n = arr.length;
        int i = 0; 
        int j = n - 1;
        while(i < j){
            if(arr[i] == 0) i++;
            if(arr[j] == 1) j--;
            if(arr[i] == 1 && arr[j] == 0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
    }


    

    public static void main(String[] args){

       int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
    //    int[] arr = {0, 0, 0, 1, 0};
        int n = arr.length;


        System.out.print("Array before Segregate 0's and 1's in arr is : " );


        for(int i = 0; i < n; i++){

            System.out.print(arr[i] + " ");

        }

        System.out.println();

        // method-01
        //  Arrays.sort(arr);
        //  System.out.print("Your sorted array from built-in method of arrays : ");
        //  for(int i = 0; i < n; i++){

        //     System.out.print(arr[i] + " ");

        //  }


        //  method-02
      // segregate0and1(arr);

        System.out.println();

        // method-03
        segregate0and1(arr);


        printArray(arr);
       
    }


    public static void printArray(int[] arr){
        int n = arr.length;
        System.out.print("Your segregated 0's and 1's after in an order : ");
        for(int i = 0; i < n; i++){

            System.out.print(arr[i] + " ");
            
        }
        
    }


}
