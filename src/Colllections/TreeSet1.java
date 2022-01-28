package Colllections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
    public void tset1(){
        //for sorting data without sort method tree set is the best approach
        TreeSet<Object> t2=new TreeSet<>();
        t2.add(3);

        t2.add(1);
        t2.add(2);
        t2.add(5);
        t2.add(4);
        Iterator i3= t2.iterator();
        while (i3.hasNext()){
            System.out.println(i3.next());

        }
        t2.pollFirst();
        System.out.println(t2);
        t2.pollLast();
        System.out.println(t2);
    }

    public static void main(String[] args) {
        TreeSet1 t1=new TreeSet1();
        t1.tset1();
    }
}
