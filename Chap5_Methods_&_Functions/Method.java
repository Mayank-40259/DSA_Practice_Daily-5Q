import java.lang.*;


public class Method {
    
     //lec.02 --> methods and behaviours how to perform in java code.
    
    public static int sumOfArray(int[] arr){
          int result = 0;

          for(int i : arr){
            result += i;
            }
          return result;
        }

    private static String upperFun(String str){
        return str.trim().toUpperCase();

    }
    private static int sum(int t, int s){
        return t + s;
    }
    private static int sum(int t,int s,int r){  //function overriding taking or passed extra parameters. --> overloaded methods.
        return t + s + r;
    }
    //naam same hai function ke parameters different or datatype different ho hai toh yes method overloading ho rahi hai.//signature. (naam + parameters).does not include returntype and accessspecifier.
    public static int multiplyOf10(int x){  //copy the value of 10 and returned to function passed.
        return x * 10;
    }
    public static String upper(String str1){
        return str1.toUpperCase().concat(" KumKum & Ansh ");

    }
    public static boolean isPrime(int y){
        int res1 = 0;
        for(int j = 1; j < y / 2; j++){
            if(y % j == 0){
                res1++;
            }

            /*13 ---> 1,2,3,4,5,6, 789101112 ,13 */
            /*if(res1 == 2){ ----> return res1 == 2;
                return true; ----> true.
              }else{
                return false; ----> false.
                }
             */

        }

        return res1 == 2;

    }
    public static int sum(int... a){
        int sum = 0;
        for(int i : a){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] a = {3, 33, 3, 3, 34, 45};
         int z = sumOfArray(a);
         System.out.println(sumOfArray(a));
         System.out.println(z);


         String res = upperFun(" Mayank Kushwah ");
          System.out.println(upperFun(" Mayank Kushwah "));
          System.out.println(res);


           int c = sum(10, 20);
           System.out.println("sum = " +c);
           System.out.println(sum(10,20));


           int m = sum(10, 20, 30);
           System.out.println("sum = " +m);
           System.out.println(sum(10, 20, 30));

           int x = 10;
           System.out.println(multiplyOf10(x));//return 100 through passed 10 and return keyword.
           System.out.println(x);

           String str1 = new String("Mayank Kumar");
           String str2 = upper(str1);
           System.out.println(upper(str1));
           System.out.println(str2);

          // int y;
           System.out.println(isPrime(13));
           System.out.println(isPrime(91));
           System.out.println(isPrime(7));
           System.err.println(isPrime(74567));

           System.err.println(sum(1,2,3));


        // int b = {3, 3, 3, 3, 3, 21, 1, 2, 33};
        // sumOfArray(b);
       
       /* Methods : Syntax --> accessModifier returnType methodName(parameters){
            //method body.

            }
        * 
        */
       
    } 

}
