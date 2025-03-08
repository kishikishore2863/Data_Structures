package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class Testing {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("kishi");
        c.add("kishore");
        System.out.println(c);
        System.out.println(c.size());

        Collection <String> c1 = new ArrayList<>();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");
        System.out.println(c1);
        c.addAll(c1);
        System.out.println(c);



    }
}
