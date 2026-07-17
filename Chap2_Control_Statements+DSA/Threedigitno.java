package Chap2_Control_Statements;
import java.util.Scanner;

public class Threedigitno{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     double num;
     System.out.println("Enter the value of num : ");
     num = sc.nextDouble();
      //fot two digits to check this like : num > 9 && num < 100
      //Three digit number 
     if(num > 99 && num < 1000){  //for two digit number num > 9 && or|| num < 100.
        System.out.println("Yes your number num is Three digit number : "  +num);
     }
     else{
        System.out.println("NO your number num is Not a Three digit number : " +num);

     }

   }

}
