import java.util.*;

public class Largest_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no: ");
        float a = sc.nextFloat();
        System.out.println("Enter Second no: ");
        float b = sc.nextFloat();
        System.out.println("Enter Second no: ");
        float c = sc.nextFloat();
        if (a > b && a > c) {
            System.out.println(a + "is largest ");
        } else if (b > a && b > c) {
            System.out.println(b + "is largest ");
        } else if (c > a && c > b) {
            System.out.println(c + "is largest ");
        } else {
            System.out.println("All no are constant");
        }
        sc.close();
    }

}
