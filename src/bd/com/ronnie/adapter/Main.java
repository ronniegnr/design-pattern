package bd.com.ronnie.adapter;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(Arrays.asList("one", "two"));
        Enumeration<String> enumeration = vector.elements();

        // convering the Enumeration to Iterator using the Adapter
        Iterator iterator = new EnumerationAdapter(enumeration);

        System.out.println(iterator.next());
    }
}
