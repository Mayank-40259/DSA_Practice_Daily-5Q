import java.util.Scanner;

public class Asciivalues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        char c;
        //num to character.
        System.out.println("Enter the num value : ");
        num = sc.nextInt();
        c = (char)num;
        System.out.println(" Your Character : " + c);

    }
    
}
