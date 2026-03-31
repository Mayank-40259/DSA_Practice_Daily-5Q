import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the number a is : ");
        a = sc.nextInt();
        if(a%2 == 0){

            System.out.println("The given number is Even :" +a);
        }
        else{

            System.out.println("The given number is Odd :" +a);

        }

    }

}
