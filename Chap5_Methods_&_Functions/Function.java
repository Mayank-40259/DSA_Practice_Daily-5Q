import java.lang.*;
import java.util.*;


public class Function {
    
       //always package problem solved by import java.util.*; --> in this package all packages are covered.//Father of all Packages//.


    //Functions in java :-
    //Function --> it is a block of code to perform a specific task.
    //block-->code// ---> input from user ---> //operation perform// ---> output produce karke deta hai.
    //example. thermometer.--> body temperature batata hai ushe use kare as input in result output get by thermometer.--> functioning perform by thermometer.
    //TV remote.--> button on/off pressed by thumb --> input to tv --> output gets is off/on --> TV.--> functioning perform by remote.
    //function is the part of our code to takes input from user and return output to user after performing operation between them.
    //takes input from user to function //--> function processing and operations //--> output gives to user as result // --> that all works performed by function.
    //1).return type --> all the datatypes what type of data takes from user as input to function // which type of value is returned to by function.
    //like. int,float,string,char,long,byte,boolean,double.
    //arrays...--> multiple values see at a time in function but after.
    //int --> integer type ke variable ko return kr payenge hm.
    //float --> float type ke variable ko return karega.
    // special type is in return type --> void : it can't returned any value and data.
    //that type of function and return type is called void. --> psvm;--> v for void aa gaya na main function me in java.
    //returntype--> void hai.
    //already studies kr chuke hain hm --> public,static and main function last one is void is all clear.

    //Syntax to write functions is :-
    // returnType_functionName(type arg1, type arg2...){
    //  //operations;
    //  //statements ;
    // }

    //Function_Name //types//--> gives by users --> 1). user-defined function. 2). Built-in Function(pre-defined or pehle se bane hue hain.).
    //example--> printmy_name() and Calculate_Sum() --> user-defined function AND Math.PI() --> built in function.
    
    //Arguments : we see this as parameter passed as arguments to function as input by user to function to perform a task.
    //at a time one,two, ...., multiple bhi aa sakte hain.
    //a condition matters always --> argument as input by user to function to used with perform an operations. with datatype --> which type of data is in it.
    //type--> int,float,String,Boolean,....
    //every arguments having same type not a condition different-different also may be (ho sakte hain) .
    //arguments insided paranthesis to differentiate by commas(,) between whwn two arguments is different.


//example 1). Print a given name in a function;
//why we are writing function name as --> printMyname --> because of Identifiers in java language.
//ese kyu nahi likha --> printmyname(); or --> print_my_name(); --> used in python or --> printMyName(); --> case followed through camel case by identifier verified this. in java used.
//to perform uniqueness in our code with systematic way also.
//and different different programming languages me alag-alag tarike ke likhe hote hain function name or tarika alag hota hai likhne ka js me alag 
// python me --> print_my_name(); // java me camel case used --> printMYName();
//Camel-case :- upper case and lower case ke letters ko likhne ka tarika hota he ye.
//
//

      public static void printMyName(String str){  //name passed as arguments in to function to perform a task(Print the name).
        //function defination and declaration.
        //string nahi likhenge in return_type me because of data insided kaisa hai uska type hm likh chuke 
        //jyada tr return type me int or void likte hain --> return 1; or return; respectively both int and void.
        System.out.println(str);
        return;  //return keyword se returned to our passing function name to main function.

      }

      //What happens in Memory?
      //-->all the functions are received in memory and placed in the form of stack.
      //--> Stack is followed --> LIFO based principles --> L=last,I=in,F=first,O=out.
      //--> last in first out --> jo pehle aaya vo baad me or jo baad me aaya vo pehle niklega.
      //using two operations in it push()-->insertion of data in memory(stack) and pop()-->deletion or reduction of data in memory(Stack).
      //ek ke upar ek kitab(book) --> books ka chatta. --> stack formation kehte hain.
      //memory ke ander function stared hote hai stack ke form me.
      //memory me stack me ek cheez ke same hone ko hm khte hain Stack trace.
      // 1st goes in stack --> main function(variables stored,data) --> call to new function --> after new function added 2nd goes in stack --> printMyName(variables stored,data,print message).
      //new stack frame made by calling from mainFunction(); to newFunction();
      //agar newFunction(return tha? ) koi value return kr de from newFunction(); ---> mainFunction(); toh memory se 2nd goes wala newFunction hat jayega or reduce ho jayega from memory(Stack).
      //or fir mainFunction(return value ko le lega? --> liya tha) to ye bhi memory(stack) se hat(delete,reduce) ho jaayega.
      //insided function(); data(variables,statement ,...) is stored in stack memeory around inside frame of stack as stack trace also.
      //jitna jyada call karenge method ya function ko toh vo memory(stack) me memory me badhta jayega log system lifo based --> kitabo(books ka chatta --> ek ke upar ek.).
      //jitna jya function banayenge aap utna jyada apki memory ka stack bharta jayega.
      //memory kaise kaam karti hai java ki jb bhi hm variable & functions(); --> assign karte hain ya define karte hain ---> in OOPs video me dhekhenge hm.
      //kyuki memory kaise kaam karegi ush pr hamare classes and object kitne hain kish tarike se hain uska bahut bada impact hota hai toh usko see in oops lectures.
      


      //Ques.2)Make a function to add 2 numbers and return the sum.

      public static int sumOfTwoNumbers(int a, int b){ //parameters received from main_function to new_function as arguments and input from user.
        int sum = a + b;
        System.out.println("your sum of "+ a +" & "+ b + " is : " +sum);
        return sum; //int use as return type --> return sum.
      }



      //Ques.3).Make a function to multiply 2 numbers and return the product.

      public static int productOfTwoNumbers(int a, int b){
        int product = a * b;
        System.out.println("your product of " + a + " & " + b + " is :" + product);
        return product;  //int use as return type --> return product.
      }

      //Ques.4).Find the factorial of a number.
      public static int factorialOfaNumber(int c){
        //fact --> as factorial.
        //number n! --> n*(n-1)*(n-2)*(n-3)! or ....(n-r)!
        //n = 5 --> 5! --> 5*4*3*2*1 --> 120 .
        //0! --> 1.
        //there is no factorial for negative numbers --> -ve numbers.

        int fact = 1;
        if(c < 0){
            System.out.println("For negative numbers no factorial for it.");
            return fact;
        }
        else if(c == 0){
            System.out.println("For case of zero factorial is find :- ????");
            for(int i = 1; i <= c; i++){
                fact = fact * i;
            }
            System.out.println("your factorial of 0! is : " + fact);
            return fact;
        }
        for(int i = 1; i <= c; i++){
            fact = fact * i;
        }
        System.out.println("Your Factorial of a number " + c + "! is : " +fact);
        return fact; //int use as return type --> return fact.
      }



      //Ques. 5).Find the Quotient of two number.
      public static int quotientOfTwoNumber(int a, int b){ //Quotient function or dividend function.
        int g = a / b;
        System.out.println("Your Quotient of " + a + " & " + b + " is : " +g);
        return g;
      }



      //Ques. 6).Find the Remainder of two number.
      public static int remainderOfTwoNumber(int a, int b){
        int r = a % b;
        System.out.println("Your Remainder of " + a + " & " + b + " is : " +r);
        return r;
      }

      //Ques.7).Difference between functions and methods :-
      //both are block of codes to perform an operations.takes input and gives output.
      //ek chota sa difference hai dono me.
      //1).methods-->methods ko hm call karte hain class ke objects ke through methods--> call by --> classes -objects through.
      //2).functions-->functions ko hm call karte hain directly.

      

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String name = sc.next();

        //curser after printing name is in it.
       printMyName(name); //Function ko call kiya hm ne.
       //always use function name using --> Camel-case.
       System.out.print("Enter the number 1 and number 2 : ");
       int a = sc.nextInt();
       int b = sc.nextInt();

       sumOfTwoNumbers(a,b); //calling to new_Function of Sum;

       productOfTwoNumbers(a,b);  //calling to new_Function of Product;

       System.out.print("Enter the number 3 : ");
       int c = sc.nextInt();
       factorialOfaNumber(c);    //calling to new_Function of Factorial;

       quotientOfTwoNumber(a,b);   //calling to new_Function of Quotient.

       remainderOfTwoNumber(a,b);   //calling to new_Function of Remainder.


    }   


}
