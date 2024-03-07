package Learn;

import com.sun.source.util.Trees;

import javax.print.attribute.HashAttributeSet;
import java.util.*;


public class StartCode {
    public static void main(String[] args) {
        System.out.println("Hello Collection Framework");


        /*
        creating collection
        1) type safe - same type of elements can be added
        2) un type safe - different types of element can be added
        */
        //type safe collection

        ArrayList<String> names= new ArrayList<String>();
        names.add("Amana");
        names.add("Ajay");
        names.add("Raman");

        System.out.println(names);
        //System.out.println(names.get(0));
        //System.out.println(names.get(2));

        //un type safe
        /*
        LinkedList list = new LinkedList();
        list.add("Sachin");
        list.add(101);
        list.add(545.4515);
        list.add(true);

        System.out.println(list);
        */
        //remove element
        names.remove("Raman");
        System.out.println(names);

        //size
        System.out.println("Size: "+names.size());

        //type ka equals method call krta hai check krne ke lie
        System.out.println(names.contains("Ayan"));

        //check for empty
        System.out.println(names.isEmpty());

        Vector<String> vector = new Vector<>();
        vector.addAll(names);
        System.out.println("Vector:" +vector);

        System.out.println("_________________");

        HashSet<Double> nms =new HashSet<>();
        nms.add(14.23);
        nms.add(34.123);
        nms.add(23.32);

        System.out.println(nms);

        TreeSet<Double> tset =new TreeSet<>();
        tset.addAll(nms);
        System.out.println(tset);

        System.out.println(tset);


    }
}
