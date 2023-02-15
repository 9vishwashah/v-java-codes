import java.util.*;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        System.out.println("Initial list of element" + hm);
        hm.put(100, "amit");
        hm.put(101, "ajay");
        hm.put(102, "rahul");
        hm.put(103, "isha");
        System.out.println("After invking put()method");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + "" + m.getValue());
        }

        hm.remove(100);
        System.out.println("Updated list of elements" + hm);
        hm.remove(101);
        System.out.println("Updated list of elments" + hm);
        hm.remove(102);
        System.out.println("Updated list of elements" + hm);
        hm.remove(103);
        System.out.println("Updated list of elements"+hm);
    }

}
