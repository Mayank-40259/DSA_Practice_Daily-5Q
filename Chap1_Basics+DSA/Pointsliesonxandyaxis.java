public class Pointsliesonxandyaxis{
    public static void main(String[] args) {
        double x = 10,y = 10 ;

        if(x != 0 && y != 0){
            System.out.println(" points lies on x and y axis either if -ve x and y axis And +ve x and y axis.");
        }
        else if(x != 0 && y == 0){
            System.out.println("The points lies on x axis");
        }
        else if(x == 0 && y != 0){
            System.out.println("points lies on y axis");
        }
        else{
            System.out.println("points lies at origin.");
        }

    }

}