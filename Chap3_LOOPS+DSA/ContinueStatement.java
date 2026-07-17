import java.util.Scanner;


public class ContinueStatement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n : - ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print("Hello ");
            
            //but break at 2 and continue from 3. 
            //by continue missing the number when we use;
            if(i % 2 == 0 ){  // n % 2 -> ko divide nahi kiya kyuki iske ander n taken number divide hoga bs.
                //hme no. print karane hai --> i % 2 --> even numbers aayenge --> continue se missing rahenge code me vo.
                //
                continue;
            }
            System.out.println(i); //bache number print honge ese hi hr ek iteration chalega.

        }

        System.out.println();

        //Ques.1). W.A.P to print odd numbers from 1 to 100.


        System.out.println("Printing Odd numbers from 1 to 100.");
        for(int i = 1; i <= n; i++){
            if(i%2 == 0){ // i % 2 == 0 --> isse sare number jo ki odd honge vo hat jayenge --> missing through continue statement;
                continue;
            }
            System.out.print(i + " ");
        }

        //Do - while loop using.
        //printing numbers from 1 to 10;
        int i = 1;
        do { 
            
            System.out.println(i + " ");
            i++;

        } while(i <= 10);

        //for loop ko while loop kaise banaye;
        //int i = 1;
        for(; i <= 10; ){
            System.out.println(i + " ");
            i++;
        }

    }
}
