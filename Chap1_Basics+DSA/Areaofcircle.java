public class Areaofcircle {
    public static void main(String args[]){
        int r = 5;
        double area = Math.PI * r * r; //area is stored in double [size]= 8 byte,Math.PI is insided value of pi = 3.1415...exists.
        double sphere = 4 * Math.PI * r * r * r;
        System.out.println("Your area of a circle is :" +area);
        System.out.println("Your area of Sphere is :" +sphere);
       
    }
    
}
