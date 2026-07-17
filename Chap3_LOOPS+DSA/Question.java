import java.util.Scanner;


public class Question {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number n : - ");
        int num = sc.nextInt();

        // Predict the output : -
        // infinite loop.
        // for(int i = 1; i > n; i++){
        //     System.out.println(i + " Is Creadited in your Bank Account.");
        // }


        //Ques.1 Bonus Question. --> count digit of a given number. --> Write a program.
       // int res;//using while loop only.

        // int count = 0;
        // if(n == 0) count++; //zero and 1 ka digit same vahi dikha raha tha ye code.

        // while(n != 0){ //n ki value jb tak zero naho tb tak divide karo n ko 10 se.
        //     //hr ek count ko badhao ek baar --> count.
        //     n = n / 10;
        //     count++;
        // }
        // System.out.println(count);

        //Ques.2).W.A.P to print sum of digits of a given number.
        //print sum of digits to a given number n; //456 --> 4+5+6 --> 15.

        //int count = 0;
    //     int sum = 0;
       
    //    // if(n == 0) sum++;
    //    //example as given number n is 1234.
    //     while(n != 0){ // n == 0 --> condition false.
    //      int lastdigit = n % 10; //not / --> yes % --> 1).4 -->2). 3 --> 3). 2 --> 4). 1. 
    //      sum = sum + lastdigit; // sum -> 0+4=4 and sum -> 4 + 3 =7 and sum -> 7 + 2 =9 and sum -> 9 + 1 = 10 final sum is 10.
    //      n = n / 10;  //n ki value hr iteration me update hogi 1234 --> 123 --> 12 --> 1 --> 0 loop terminate or break.

    //     }
    //     System.out.println(sum);
        
        //Ques.3). write a program to print product of digits of a given number.
        // int product = 1; //initialization hua 1 se bs.
        // while(n != 0){
        //     int lastdigit = n % 10;
        //     product = product * lastdigit;
        //      n = n / 10;
        // }
        // System.out.println(product);

        //Ques.4).Print the product of all non-zero digits of given number.
        // int prod = 1;
        // while(n != 0){
        //     int lastdigit = n % 10;
            // if(lastdigit == 0){
            //     prod = 0; //agar last digit zero hai to product zero hoga bs.
            //     break; //loop se bahar aa jao bs.
            // }else{           
            // prod = prod * lastdigit;
            // n = n / 10;
            // }
        //     if(lastdigit != 0){ //agar last digit zero nahi hai to hi product me multiply karo.
        //         prod = prod * lastdigit;
        //     }
        //     n = n / 10; //n ki value hr iteration me update hogi 1234 --> 123 --> 12 --> 1 --> 0 loop terminate or break.
        // }  
        // System.out.println(prod); 

        // Ques.5). Write a program to print sum of all the even digits of a given number.
        // int sum = 0;
        // //n --> 12345.
        // while(n != 0){
        //     int lastdigit = n % 10;
        //     if(lastdigit % 2 == 0){ //even wale numbers print honge lastdigit se add honge sum me.
        //         sum = sum + lastdigit; //sum of digit karega ye --> 1234 --> 0 + 2 = 2 --> 2 + 4 = 6 //finally hoga sum = 6;
        //     }
        //     n = n / 10;  //hr iteration chalane ke liye hai ye. 1234 --> 123 --> 12 -> 1 --> 0. terminate or break the loop.
        // }
        // System.out.println(sum); //6 aaya answer for adding even numbers according to the question.

        //Ques.6).Write a program to print product of all even digits of a given number. --> dikkat hai isme.
        // int product = 1;
        // while(n != 0){ 
        //     int lastdigit = n % 10;
        //     if(lastdigit % 2 == 0){ //even numbers ka hi multiply hoga.
        //         product = product * lastdigit;  // product of digits karega ye -->1234 --> 1 * 4 = 4 --> 4 * 3 = 12 --> 12 * 2 = 24 --> 1 * 24 = 24 .finally product = 24;
        //     }
        //     n = n / 10; // to iteration change karne ke liye karenge hm aisa.
        // }
        // System.out.println(product);

        //Ques.7). Write a program to print reverse of a given number.
   //     int rev = 0;
      //  int rev = 0; //n --> 12345 reverse karna hai rev --> 54321.
      //rev as reverse variable inside it.

      // n -> 2340 --> zero hat jayega rev -> 432 print hoga.
      // n -> 00542 --> reverse rev -> 245.
      // n -> -345 ---> reverse rev -> -543.  condition badal do  n > 0.
        // while(n != 0 ){ 
        //     int ld = n % 10; //12345 n ki value change hoti hai yahan pr digits hain jo vo hi n is values hain.--> 1234 -> 123 -> 12 -> 1 -> 0 finally terminate the loop.
        //     rev  = rev * 10; // 0*10=0 -> 5 * 10 = 50 -> 54 * 10 = 540, 543 * 10 = 5430, 5432 * 10 = 54320, 54321 --> rev as reverse of digits print by sout.
        //     rev = rev + ld;  // 0 + 5 ->5, 50 + 4 -> 54, 540 + 3 = 543, 5430 + 2 = 5432, 54320 + 1 = 54321, value hogi zero 0 = ld. 0 + karo same hi rahega .
        //     n = n / 10;  //12345 --> 1234 --> 123 -> 12 -> 1 -> 0 --> condition check karne n != 0 pr apka zero hai n = 0 toh condition false ho jayegi.

        // }
        // System.out.println(rev);

        //Ques.8).Write a program to print the sum of given number and its reverse.

        int n = num;  // ishi se error gaya hai n = 0  wala jo loop khatam hone ke baad tha or hame number jodne the;
        int rev1 = 0;
        while(num != 0){ 
            int ld = num % 10;
            rev1 = rev1 * 10;
            rev1 = rev1 + ld;
            num = num / 10; //m = 0 ka error tha yahan.

        }

         System.out.println(rev1);
        System.out.println("sum = " + (rev1 + n));


        //Ques.9).Print the factorial of a given number n is.
         // a). print the factorials of first n numbers.

        int factorial = 1;
        for(int i = 1;i <= n;i++){
            factorial = factorial * i; // 5! = 5*4*3*2*1 = 120  //--> 1-> 2 -> 6 -> 24 -> 120. 
            System.out.println("Your factorial of "+ i + "! is :- " + factorial); //for 9 ques -> a ques.
        }
      //  System.out.println("Your factorial of " + n + "! is :- " + factorial); //for 9 ques.


    

      //Ques.10).W.A.P to print all the ASCII values and their equivalent characters of 26 alphabets using a while loop.
         //logic is  -> (char)i --> from integer to character.
         //logic is  -> (int)ch --> from character to integer.
         for(int i = 97; i <= n; i++){  // A -> 65 to Z -> 90. and a -> 97 to z -> 122. 
            System.out.println(i +" - " +(char)i); //ASCII values print.

         }

    }

}
