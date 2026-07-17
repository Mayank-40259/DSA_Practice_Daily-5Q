import java.lang.*;  //all include --> all packages
import java.util.Scanner; //Scanner class --> read our project.


//Ques.0). Print number from 1 to n.
//using scanner package to taking input from user.


public class Number{
     //Ques.1) Printing numbers from 1 to 10 and 100.
     //1).using while loop and for loop.

    public static void main(String[] args){

         Number num = new Number();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number n : ");
         int n = sc.nextInt();
 
         //a).using while loop to printing number 1 to 10 or on 100....

        //  int i = 1;
        // while(i <= n){
        //     System.out.println(i);
        //     i++;
        // }

        //b).using for loop to print number from 1 to 100 and on 1000....
        //int ko ish vajh se nahi likha pehle while loop ke liye initialize hai.

     //   System.out.println("Even Numbers from 1 to " +n);
        System.out.println("Print all the number from 1 to " +n);
        for (int i = 1;i <= n; i++) {
            System.out.println(i);
        }

        //Ques.2).Print all even number from 1 to 100 and upto 1000...
        
        //a). using while loop to print even numbers from 1 to 100 and upto 1000...
         //while loop me ye possible nahi hai.

//        int i = 1;
//         while(i <= n){
//             if(i%2 == 0){ //remainder 0 aaye.
//                 System.out.println(i);
//                 i++;
//             }
//             // else{
//             //     System.out.println(i);
//             // }
//    }
            //b). using for loop to print even number from 1 to 100 and upto 1000.... .
            System.out.println("Print all the Even Number from 1 to " +n);
              for(int i = 1; i <= n; i++){
                if(i%2 == 0){
                    System.out.println(i);
                }
              }

            //c). using for loop to print odd number from 1 to 100 and upto 1000.... .
            System.out.println("Print all the Odd Numbers from 1 to " +n);
            for(int i = 1; i <= n; i++){
                if(i%2 != 0){  //!= not equal matlab barabar nahi hai.
                  System.out.println(i);
                }
            }

            //Ques.3).Print all the numbers from 1 to 100 which are divisible by 3.
            //condition --> divisible by 3.--> i % 3 == 0.
            System.out.println("Print all numbers from (1 to 100) divisible by 3 is :");
            for(int i = 1; i <= n; i++){
                if(i % 3 == 0){
                    System.out.println(i);
                }
            }

            //Ques.4). Print the table of 19.
            //a). Print the table of n.Here n is a integer which user will input.


            System.out.println("Print the Table of " +n);
            System.out.println("Your table of " + n + " is :- ");

            int m;
            for(int i = 1; i <= 10; i++){
                m = n * i; //n is user taken input on output screen.

              System.out.println(n + " x " + i +" = "+m);

            }
             //or --> isse bhi table print ho jayega.
             for(int i = 1; i <= 190; i++){
                if(i%19 == 0){
                    System.out.println(i);
                }
             }


            //Ques.5). Print the numbers from 10 to 1.
            //ulta printing.
            System.out.println("Print the numbers from " + n + " to 1");
            for (int i = n; i >= 1; i--){
                System.out.println(i);

            }

            //Ques.6).Print and display this AP --> 1,3,5,7,9....upto 'n' terms.
           //AP --> Arithmetic progression class 10 chap.5 mathematics :-
          // 
        //   int z = 0;
        //   for(int i = 1; i <= n; i++){
        //     z = z + i - 1;
        //     System.out.println(z);
        //   }

        // error code ayega (ap galat print hogi) --> wrong ayegi AP direct method se.
        //where in AP we have given -> 1,3,5,7,9 ....  a->first term = 1, n->nth term = n, d->common difference = a3rd-a2th = 5 - 3 = d = 2;
        //using AP formula a-nth = a + (n-1)*d; --> a-nth = 1 + (n-1)*2 --> a-nth = 1 + 2n - 2 --> a-nth = (2n - 1); 
        //a-nth = 2*n-1; last term of printing loop is l = 2*n-1;
        //loops kitne times chal raha hai reality n-times hi chal raha hai loops.
        System.out.println("Your given A.P(Arithmetic Progression) series is : - ");
        for(int i = 1; i <= 2*n-1; i=i+2){ //always write ki i = i + 2, because common differenc of AP is d = 2. ; & not and never used --> i = i + 1; or i++;
            System.out.print(i + ", ");
        }

       System.out.println();
        //Ques.7).Display this A.P - 4,7,10,13,16,.. upto 'n' terms.
        //using ap formula a-nth = a + (n-1)*d --> a-nth = 4 + (n - 1)*3; --> a-nth = 4 + (3n-3) --> a-nth = 3n + 1;
        //loops kaha tak chalega --> a-nth = 3 * n + 1; pr reality me n-times tak hi chalega.
        //first term ko hm --> i ki jagah likhte hain loop me.


        System.out.println("Yours given A.P(Arithmetic Progression) series is : - ");
        for(int i = 4; i <= 3 * n + 1; i+=3){  //always write ki i = i + 3;
            System.out.print(i + ", ");
        }

        System.out.println();
         //or dusra tarika A.P --> nikalne ka.

         System.out.println("Yours given (Arithmetic Progression) series is : -");
         //a-->first term is a = 4; d-->common difference is d = 3;
         //creating variables ;

         int a = 4, d = 3;  //for ques 7.
         //int a = 1, d = 2; //for ques 6.
         for(int i = 1; i <=n ; i++){
            System.out.print(a+ ", ");
            a += d; //assignment operator --> a = a + d;
         }

         System.out.println();

         //Ques.8). Display this G.P(Geometric Progression) - 1,2,4,8,16,32,... upto 'n' terms.
         //method.1)--> a=1,r=2 --> a-nth = a*r^n-1. a = 1, r as --> d common difference but some different r2/r1 = 2; & r = 2, -->stil power nahi nikal sakte.
         //method.2)--> a=1,r=2 --> loop chalayenge 'n' times i = 1 to n-times i++,
         // 1 2 4 8 16 32.... upto n terms. //gp-1
         // 3 12 48 192 ..... upto n terms. //gp-2
         //creating variables b as first term a and r is common difference as d.
         System.out.println("Yours given G.P(Geometric Progression) series is : -");
         System.out.println();
         System.out.println("all these types of  storages SSD available in market with suitable prices also.");
         System.out.println();
         int b = 1, r = 2; //for gp-1
        // int b = 3, r = 4; //for gp-2
         for (int i = 1; i <= n; i++) {
            System.out.print(b+"GB SSD, ");
            b *= r; // assignment operator --> b = b * r;
         }

         System.out.println();
         System.out.println();

         //Ques.9).W.A.P to find the highest factor of a number 'n' (other than n itself).
          //n = 60;
          //1,2,3,4,5,6,10,12,15,20,30,60;
          //highest factor ==> of 60 ==> is : - ==> 1 konsa hoga vo print karo.
          //faltu me kyu print kare hm aage se jb highest factor nikal rahe hain hm (from i = 1 to i <= n with i++ )tak; ---->>>> jb ki hm kr sakte hain
          //---->>>> (from i = n - 1 to i >= 1 with i-- ). --> after break kr de hm loop ko break statement se.
          //

          int hf = 1; //hf as highest factor.
            for(int i = n-1; i >= 1; i--){ // 1 to n-1 changed to n-1 to 1 because of using break or kyu likhe faltu numbers jb highest hi chahiye toh.
               
              if(n % i == 0){ //i is a factor of n is what and write.
                System.out.print(i+ " ,"); //yaha vahi i as honge jo higest factor honge 60 ke. --> pr aise toh bahut sare print honge 
                //toh hame loop ko rokna hoga by using --> break; --> statement.
              // hf = i;
                break; //break --> terminate or break the loop by break statement; //60 --> 30 aaya pr kyu --> highest hai // 1 kyu aaya kyuki ek hi factor hoga iska highest number me.
              }

            }
            System.out.println();
            System.out.println("Your Highest Factor of " + n + " is :- " + hf);
            System.out.println();

            //Ques.10). Program to check if a number is prime or composite.
            //condition for prime Number. --> n%n == 0 && n%1 == 0 ---> printing prime number
            //condition for composite Number. --> n%i == 0 && n%1 == 0 --> printing composite number.

            int g = 0;
            for(int i = 1; i <= n; i++){

            }
            //  if(n % n == 0 && n % 1 == 0){  //--> for Prime Numbers.
            //        for Prime Number --> when between i=2 and to i=n-1 it has a factor.
            //           60 --> 2 , 3, 4, 5, 6, 10, 12, 15, 20, 30;
            //         System.out.println("These numbers are Prime Numbers :- " + n);
            //     }

            //             for Composite number -> when it has (i >= 3 && )
            //     else{  //--> (n % i == 0 && n % 1 == 0). --> for Composite Number.
            //         System.out.println("these Numbers are Composite Number :- " +n);
            //     }

    }
}