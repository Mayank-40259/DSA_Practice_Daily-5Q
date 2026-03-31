import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi=3.1415;
        double radius;
        System.out.println("Enter the radius of Circle is : ");
        radius = sc.nextDouble();
        double areaofcircle = Math.PI*radius*radius;
        System.out.println("Your Area of Circle is : " +areaofcircle);
        
    }
    
}
