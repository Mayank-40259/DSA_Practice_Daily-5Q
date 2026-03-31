import java.util.Scanner;

public class Nestedifelsegreatestnum{
    public static void main(String[] args) {
        
    //Check if three given number is greatest of them by using nested if else.
    
    Scanner sc = new Scanner(System.in);
    double num1,num2,num3; // a,b,c;
    System.out.println("Enter the num1 : ");
    num1 = sc.nextDouble(); //a
    System.out.println("Enter the num2 : ");
    num2 = sc.nextDouble(); //b
    System.out.println("Enter the num3 : ");
    num3 = sc.nextDouble(); //c

    if(num1 > num2){  // a > b
        if(num1 > num3){  // a > c
            System.out.println("num1 is Greatest : " +num1); //a is greatest
        }
        else{
            System.out.println("num3 is Greatest : " +num3); //c is Greatest
        }
    }
    else{
        if(num2 > num3){  //b > c
            System.out.println("num2 is Greatest : " +num2); // b is Greatest
        }
        else{
            System.out.println("num3 is Greatest : " +num3); //c is greatest.
        }

    }

  }

}
