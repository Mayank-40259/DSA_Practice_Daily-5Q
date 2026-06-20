import java.util.Scanner;

public class Prime {

    public static void main(String[] args){
        Prime pm = new Prime();
        Scanner sc = new Scanner(System.in);
           System.out.println("Enter The Number n : ");
           int n = sc.nextInt();

           //why boolean --> because of we not declare prime number and we check it.
           //if a number i is factor of n then n/i is also a factor.
           //before squareroot and aftersquareroot  between 6 and 10 are equal number.
           // 1 , 2, 3, 4, 5, 6, 10, 12, 15, 20, 30, 60.
           // sqrt(60) --> is lies between 6 and 8 --> sqrt(64)--> 8 and sqrt(49)--> 7 and sqrt(36)--> 6.
           //we also check 2 to n-1 loop and  2 to sqrt(n).

           boolean flag = false; //false means prime number.


           //for prime number only --> lowest prime number --> 2 and highest...n is n-1 .
           //at loop enf --> Math.sqrt(n);

           for(int i = 2; i <= Math.sqrt(n); i++){ //agar kisi bhi number ka factor mil gaya toh i is factor of n --> Composite Number hoga condition ko dekhte hue if() wali.  // <= n-1 and < n;
            if(n%i == 0){ //-->condition valid for composite number.
                //many times print hoke ishliye aaya composite number kyuki --> bahut factor hote hain ek number ke.
               //toh jaise 60 --> 30,15,12,10,6,5,4,3,2,1 --> use karenge --> break; statement.
               flag = true; // true means Composite Number.
               break;

            }
        }
        if (n == 1) {
            System.out.println("Neither Prime nor Composite");
        }

        else if(flag == false){  //false ka matlab --> Prime Number.
        System.out.println("Prime Number");
        }

        else{ //flag ki value true hoga else ulta hota hai if() ka --> Composite Number.
            System.out.println("Composite Number");
        }
        
    }
}
