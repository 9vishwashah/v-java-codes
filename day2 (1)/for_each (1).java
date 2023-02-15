import java.util.*;

public class for_each {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        for (String s : list) {
            System.out.println(s);
        }
    }
}