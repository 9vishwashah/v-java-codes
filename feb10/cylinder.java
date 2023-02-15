// package feb10;
import java.util.*;
public class cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of Cylinder: ");
        float r = sc.nextFloat();
        System.out.println("Enter the height of Cylinder: ");
        float h = sc.nextFloat();
        // float area = (2*3.14*r*h)+(2*3.14*r*r);
        double area = ((2*22*r)/7)*(r+h);
        System.out.println("Surface area is: "+ area);  
        double volume = (3.14*r*r*h);
        System.out.println("volume of cylinder is: "+volume);
        sc.close();
    }
}
