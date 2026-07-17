package Chap2_Control_Statements;
import java.util.Scanner;

public class Rectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double arearectangle,perimeterrectangle,length,breadth;
            System.out.println("Enter the length of Rectangle : ");
            length = sc.nextDouble(); //taking input of length
            System.out.println("Enter the breadth of Rectangle : ");
            breadth = sc.nextDouble(); //taking input of breadth
            arearectangle = length * breadth;  //as area of rectangle
            System.out.println("Your Area of Rectangle is : " +arearectangle);
            perimeterrectangle = 2*(length + breadth); //as circumferance of rectangle 
            System.out.println("Your Perimeter of Rectangle is : " +perimeterrectangle);

            if(arearectangle > perimeterrectangle){
                System.out.println("Your Area of Rectangle is Greater than Perimeter of Rectangle : " +arearectangle);
            }
            else{
                System.out.println("Your Perimeter of Rectangle is Greater than Area of Rectangle : " +perimeterrectangle);

            }

    }

}