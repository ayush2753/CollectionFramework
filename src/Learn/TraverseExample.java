package Learn;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class TraverseExample {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<String>();
        names.add("Amana");
        names.add("Ajay");
        names.add("Raman");

        //foreach loop
        for(String str:names)
        {
            System.out.println(str +"\t"+ str.length() + "\t");
            StringBuffer br=new StringBuffer(str);
            System.out.println(br.reverse());
        }
        System.out.println("_______________");

        //using iterator
        Iterator<String> itr = names.iterator();
        while(itr.hasNext())
        {
            String next = itr.next();
            System.out.println(next);
        }
        System.out.println("++++++++++++");

        //backward traversal
        ListIterator<String> litr = names.listIterator(names.size());
        while(litr.hasPrevious())
        {
            String previous = litr.previous();
            System.out.println(previous);
        }

        System.out.println("-----------");
        //foreach
        names.forEach(e->{
            System.out.println(e);
        });

    }
}
