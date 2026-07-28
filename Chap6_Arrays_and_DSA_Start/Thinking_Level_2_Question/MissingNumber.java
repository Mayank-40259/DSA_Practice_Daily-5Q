public class MissingNumber {
    
    //Program 23). :- 

    //Ques 18). :- Missing in Arrays elements.
    
    //Problem: Missing in Array (GFG) / Missing Number (LeetCode 268)
    // Logic: Total Sum of N numbers - Sum of elements present in array
    
    
    // int[] arr = {8, 2, 4, 5, 3, 7, 1};
    // output = 6.
    //  main logic : - ek number missing hai ish liye array me hmne ushe bhi le liya kyuki 
    //                 array ki sabhi elements ko add kr ke jo sum aayega usme se hm actual present 
    //         element in the array present me unko substract kr denge. jitna bachega vo array ka element hoga.
    // 
    // 


    // Note : -  Saari kahani is baat par tikki hai ki array ki length 
    //           kitni hai aur aap kis range ka sum nikal rahe ho.
    

    public static int missingNum(int arr[]) {
        // code here
        int n = arr.length + 1; //array ki length me ek joda hai kyuki ek number hr array me missing hai.
        // 1 to n tak numbers honge arr me. 1 to 10 tak ka sum --> n(n+1)/2--> 10(11)/2-->55.
        // 1 to n tak ke question ka sum kya hota hai --> n + 1.
        // array ka bhi sum aata hai hm ko.
        int sum = n*(n+1)/2; // arr[]1st array ke liye --> [1 2 3 5] --> 4 output.
        int arraySum = 0;
        for(int ele : arr){
            arraySum += ele;
        }

       
        return sum - arraySum;

    }

    public static int missingNumArr1(int[] arr1){
        int n = arr1.length + 1; //extra element jo missing hai usko likha hai hmne as indexed position ko count leke in length.
        int sum1 = n*(n+1)/2; // sum karenge jo elements he usme extra wale ko bhi jo missing hai.
        int arraySum1 = 0; //sum of array1 ka initialization.
        for(int ele : arr1){
            arraySum1 += ele;
        }
        
        return sum1 - arraySum1; //find element is missing.
    }


    public static void main(String[] args) {

        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        int[] arr1 = {1, 2, 3, 5};
        System.out.println("Your missing element in the Array-1 is : " + missingNum(arr));
        System.out.println("Your missing element in the Array-2 is : " + missingNumArr1(arr1));
    }    

}
