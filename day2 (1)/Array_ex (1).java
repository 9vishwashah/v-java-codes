import java.util.*;

public class Array_ex {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 5, 7, 8, 3 };
        ArrayList<Integer> arr_new = new ArrayList<Integer>();
        for (int i : arr) {
            arr_new.add(i);
        }
        arr_new.remove(4);
        System.out.println("Array before deletion: " + Arrays.toString(arr));
        System.out.println("Array after deletion: " + arr_new);
    }

}
