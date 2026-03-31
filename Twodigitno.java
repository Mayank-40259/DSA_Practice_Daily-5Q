import java.util.Scanner;

public class Twodigitno{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          double num;
          System.out.println("Enter the num : ");
          num = sc.nextDouble();

          if(num > 9 && num < 100){
            System.out.println("Your number num is two digit number :" +num);
          }
          else{
            System.out.println("Your number num is not two digit number :" +num);
          }
    }

}
