import java.util.Scanner;

public class Greatestofthreeno{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double first,second,third;

        System.out.println("Enter the First number : ");
        first = sc.nextDouble();
        System.out.println("Enter the Second number : ");
        second = sc.nextDouble();
        System.out.println("Enter the Third number : ");
        third = sc.nextDouble();

        //first = a,second = b,third = c;
        if(first > second && first > third){ //a is max.
            System.out.println(first+ "nFirst number is Greatest");
        }
        else if(second > first && second > third){ //b is max.
            System.out.println(second+ " Second number is Greatest");
        }
        else{ //c is max already.
            System.out.println(third+ " Third number is Greatest");
        }

    }

}
