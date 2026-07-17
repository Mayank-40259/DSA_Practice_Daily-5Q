
public class Straightline {
    public static void main(String[] args) {

        //Check if the given three A(x1,y1),B(x2,y2),C(x3,y3) points lies on a single straight line.
        double x1 = 1,x2 = 2,x3 = 3,y1 = 1,y2 = 2,y3 = 3;
        double m1 = (y2-y1)/(x2-x1);
        double m2 = (y3-y2)/(x3-x2);


        if(m1 == m2){
            System.out.println("The three points lies on a single straight line");
        }
        else{
            System.out.println("they do not lies on a single straight line");
        }

    }

}
