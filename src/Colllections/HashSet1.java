package Colllections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public void hashMethod1(){

        HashSet<Object> h2=new HashSet<>();
        h2.add("Java");
        h2.add("Selenium");
        //heterogeneous type of data

        h2.add(10);
        h2.add("Manual");
        //Iterator
        Iterator i1=h2.iterator();
        // iterator is only used to iterate elements in the forward direction

        while(i1.hasNext()){
            System.out.println(i1.next());
        }


    }

    public static void main(String[] args) {
        HashSet1 h1=new HashSet1();
        h1.hashMethod1();
    }
}
