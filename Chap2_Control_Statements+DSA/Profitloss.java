package Chap2_Control_Statements;
import java.util.Scanner;

public class Profitloss {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       double sellprice,costprice,profit,loss;

       System.out.println("Enter the Cost Price of a Product : ");
       costprice = sc.nextDouble();
       System.out.println("Enter the Selling Price of a Product : ");
       sellprice = sc.nextDouble();

       if(sellprice > costprice){
               profit = sellprice - costprice;
               System.out.println("You are in Profit : " +profit);
       }
       else if(sellprice == costprice){
                System.out.println("No Loss No Profit");
       }
       else if(sellprice < costprice){
           loss = costprice - sellprice;
           System.out.println("You are in Loss : " +loss);

       }

    }

}
