import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("Enter the value of x : ");
    x = sc.nextInt();
    System.out.println("Enter the value of y : ");
    y = sc.nextInt();
        int z = x * y;
        System.out.println("Square of number that you gave is : " +z);
        System.out.println(y);
    }

}
