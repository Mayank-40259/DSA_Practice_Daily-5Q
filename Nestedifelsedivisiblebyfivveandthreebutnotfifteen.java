import java.util.Scanner;

public class Nestedifelsedivisiblebyfivveandthreebutnotfifteen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Check if given number is divisible by 5 and 3 but not divisible by 15.

        double num;
        System.out.println("Enter the number num : ");
        num = sc.nextDouble();
        
        if(num % 5 == 0 && num % 15 != 0){
            if(num % 3 == 0 && num % 15 != 0){
                System.out.println("num is divisible by 5 and 3 but not 15 : " +num);
            }
            else{
                System.out.println("num is divisible by 5 but not 3 and 15 : " +num);
            }
        }
        else{
            if(num % 3 == 0 && num % 15 != 0){
                System.out.println("num is divisible by 3 but not 5 and 15 : " +num);
            }
            else{
                System.out.println("num is not divisible by 3 and 5 also 15 : " +num);
            }

        }  

    }

}
