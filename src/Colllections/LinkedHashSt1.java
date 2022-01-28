package Colllections;

import java.util.LinkedHashSet;

public class LinkedHashSt1 {
    public void hashSt12() {
        //declaring a hashset
        LinkedHashSet<Object> l1 = new LinkedHashSet<>();
        //adding elements into the linkedhashset
        l1.add("java");
        l1.add("python");
        l1.add("SQL");
        l1.add("Aws");

        System.out.println(l1);
        l1.add(null);
        System.out.println("after adding first null value " + l1);
        l1.add(null);
        System.out.println("after adding second null value " + l1);
        l1.add("java");
        System.out.println("after adding duplicates " + l1);

    }

    public static void main(String[] args) {

        LinkedHashSt1 h1 = new LinkedHashSt1();
        h1.hashSt12();
    }


}