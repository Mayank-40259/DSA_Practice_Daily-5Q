import  java.lang.*;
import java.util.*;


public class Binarynumberstriangle {

    //Program 26). : - Print the given pattern.

    /*
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
    */


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows m : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of rows n : ");
        int n = sc.nextInt();

        //Logic of program : - Binary numbers 0 & 1 triangle .
        // 

        if(m == n)
            for(int i = 1; i <= m; i++){  //rows
                for(int j = 1; j <= i; j++){  //columns


                    //1).sum of even and odd.
                     if((i+j)%2==0) System.out.print(1+" ");
                     else System.out.print(0+" ");


                    //2). code ko chota kiya hai hm ne.
                    //Chahe kuch bhi likho : - 

                    if((i%2==1 && j%2==1) || (i%2==0 && j%2==0)){
                        System.out.print(1 + " ");
                    }
                    else{
                        System.out.print(0 + " ");
                    }


                    //3). using nested-if else.

                    // if(i%2 != 0){
                    //     if(j%2 != 0) System.out.print(1+" ");
                    //     else System.out.print(0+" ");
                    // }
                    // else{
                    //     if(j%2 == 0) System.out.print(1+" ");
                    //     else System.out.print(0+" ");
                    // }

                }
                System.out.println();
            }


    }
}
