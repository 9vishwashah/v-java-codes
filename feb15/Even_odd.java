import java.util.*;

public class Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("It is a even number");
        } else {
            System.out.println("It is an odd no");
        }
        sc.close();
    }
}