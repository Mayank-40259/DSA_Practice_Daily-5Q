import java.util.Scanner;

public class Circumfrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;
        double pi = 3.1415;
       // radius = sc.nextDouble();
        System.out.println("Enter the radius of circle is : ");
        radius = sc.nextDouble();
        double circumfrence = 2*pi*radius;
        System.out.println("Your Circumfrence of circle is : " +circumfrence);

    }

}
