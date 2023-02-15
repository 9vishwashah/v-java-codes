public class add_no {
    public int Add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static void main(String[] args) {
        int a = 25;
        int b = 25;
        add_no obj = new add_no();
        int result = obj.Add(a, b);
        System.out.println("The additon is " + result);
    }
}
