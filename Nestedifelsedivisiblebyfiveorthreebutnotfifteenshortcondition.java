import java.util.Scanner;

public class Nestedifelsedivisiblebyfiveorthreebutnotfifteenshortcondition {
    public static void main(String[] args) {

        //check if a given  number is divisible by 5 or 3 but not 15 in short if else statement without using nested if else.
        Scanner sc = new Scanner(System.in);
        double num;
        System.out.println("Enter the num : ");
        num = sc.nextDouble();

        if(num % 5 == 0 || num % 3 == 0 && num % 15 != 0){  //or-->(num%15 != 0 && num%5 == 0 || num%3 == 0)
            System.out.println("num is divisible by 5 or 3 but not 15 : " +num);
        }
        else{
            System.out.println("Not matching the required condition");
        }

    }

}
