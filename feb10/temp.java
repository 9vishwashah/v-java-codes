
// package feb10;
import java.util.*;

public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Farenheit");
        float n = sc.nextFloat();
        float c = ((n - 32) * 5 / 9);
        System.out.println("The temperature in Celsius is: " + c);
        sc.close();
    }
}
