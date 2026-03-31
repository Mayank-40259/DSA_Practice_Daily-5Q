import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double year;
        System.out.println("Enter the year : ");
        year = sc.nextDouble();

        if(year%4 == 0){

            System.out.println("LEAP YEAR AFTER 4 YEARS");
        }
        else{
            System.out.println("Not Leap year");
            
        }

    }

}
