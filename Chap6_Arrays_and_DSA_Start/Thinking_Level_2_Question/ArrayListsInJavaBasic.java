import java.lang.*;
import java.util.ArrayList;

public class ArrayListsInJavaBasic {


    // Program 26). : -

    // Ques 21). :- ArrayList In Java Basics.
    // isme unlimited tak size hota hai.


    public static void main(String[] args){
        // khali arraylist hai ye --> 
        // dono alag alag cheeze hoti hain.
        // capacity --> 
        // size of arraylist --> hai abhi 0 zero.
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25); // zero 0 index pr hai 25.
        arr.add(21); // first 1 index pr hai 21.
        arr.add(18); // second 2 index pr hai 18.
        arr.add(5); // third 3 index pr hai 5.
        arr.add(10); // fourth 4 index pr hai 10.

        // isme size dene ki zarurat nahi hai, ye apne aap size ko increase kar lega.

       // System.out.println(arr[2]); //yahan pr ye bhi kaam nahi karta hai. --> ye kaam nahi hota hai yahan pr.
       System.out.println(arr.get(2)); // arr[2] // ye kaam hota hai yahan pr.
      // arr[3] = 50; //ye bhi nahi hota yahan pr
    //   arr.get(3) = 50;  //  // ye bhi nahi hota yahan pr 
      arr.set(3,50); //arr[3] = 50. // ye kaam karega as 3 index pr value 50 kr do set.

    //   not traversing the array by ourselves.
      System.out.println(arr); // array me ye nahi chalta hai address print hota hai arr ka 
    //   yahan pr print hota hai arraylist ke sabhi elements.
    // array toh print ho rahi hai but backend pr loop chal rahi hai array ko print karane ke liye and beech me commas laga deta hai ye,bracket bhi laga deta hai.
    int n = arr.size(); //array list ki length nahi hogi size() hoga with paranthesis.


    for(int i = 0; i < n; i++){
        System.out.print(arr.get(i) + " "); // loop se bhi kam kr sakte hai array ko 
    }

    System.out.println();

    for(int ele : arr){
        System.out.print(ele + " ");
    }

    System.out.println();

    // 25 21 18 50 10
    arr.add(78); // array hoaga mera  --> 25 21 18 50 10 78 <- koi bhi naya element last me add hota hai.
    // print lagake check bhi kr sakte ho aap.\
    arr.add(1,100);// arr ke 1st index pr 100 liyao --> 25 100 21 18 50 10 78 <-- //25 and 21 ke beech me 100 ko insert kr du kaise hoga .

    System.out.println(arr);
    // last index remove karna hai to 
    arr.remove(4); // 4th index element remove karenge.

    // 4th index se 50 hat gaya hai.
    System.out.println(arr);

    arr.remove(arr.size()-1); //last wala array element hatayenge. --> not use this --> n - 1 --> array ka size change hote rehta hai in array list me.
    System.out.println(arr);

  
   // Collections.reverse(arr); //method-1 built in method (pehle se bane hue methods) --> reverse karne ke liye. &&  two pointer while loop swapping bhi hm kr sakte hain.

    // method - 02.
     int i = 0; int j = arr.size()-1;
     while(i < j){
      int temp = arr.get(i);    //
      arr.set(i,arr.get(j));    // 
      arr.set(j,temp);         // 
      i++;
      j--;
     }


    System.out.println(arr);

    // Array-List-Data-Types kaise banate hai sabhi ki classes of ArrayList and obj hoga --> arr as reference but dta kis tarah ka hoga arraylist me vahi data ka types hota hai.
    // in integer --> ArrayList<Integer> arr = new ArrayList<>(); --> tum yahan bhi likh sakte ho --> ArrayList<Integer> arr = new ArrayList<Integer <-- Yahan pr >();
    //  in character --> ArrayList<Character> arr = new ArrayList<>();
    // in double --> ArrayList<Double> arr = new ArrayList<>();
    // in String --> ArrayList<String> arr = new ArrayList<>();
    // 
    // 
    // 
    

    }

}
