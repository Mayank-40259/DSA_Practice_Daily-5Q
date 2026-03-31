import java.util.Scanner;

public class Nestedifelsedivisiblebyfiveandthree {
    public static void main(String[] args) {

        //Check if given number is divisible by five and three.using nested if else.
        Scanner sc = new Scanner(System.in);
        double num;
        System.out.println("Enter the number : ");
        num = sc.nextDouble();
        if(num % 5 == 0){
            if(num % 3 == 0){
                System.out.println("num is divisible by 3 and 5 both : " +num);
            }
            else{
                System.out.println("num is not divisible by 3 but 5 : " +num);
            }
        }
        else{
            if(num % 3 == 0){
                System.out.println("num is divisible by 3 but not 5 : " +num);
            }
            else{
                System.out.println("num is not divisible by 3 and 5 both : " +num);
            }
        }
    }
}
