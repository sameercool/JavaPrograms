package Colllections;

import java.util.Vector;

public class Vector1 {
    public void vecMethod(){
        Vector<Object> v2=new Vector<>();
        v2.add("tiger");
        v2.add(2);
        v2.add("lion");
        System.out.println(v2);
        System.out.println("The capacity "+v2.capacity());
        System.out.println("the size is "+v2.size());
    }
    public static void main(String[] args) {
        Vector1 v1=new Vector1();
        v1.vecMethod();
    }
}
