import java.util.Scanner;

public class Square{
 public static void main(String[] args) {
      //Q).Given length and breadth check if given rectangle is a square or not.
     Scanner sc = new Scanner(System.in);
     double length,breadth;

   
     System.out.println("Enter the length : ");
      length = sc.nextDouble();
     System.out.println("Enter the breadth : ");
    breadth = sc.nextDouble();

     if(length == breadth){

        System.out.println("It is a SQUARE");
     }
     else{
        System.out.println("It is not a Square but Rectangle");

     }
     
  }

}
