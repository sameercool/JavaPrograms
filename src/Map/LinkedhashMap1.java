package Map;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LinkedhashMap1 {
    public void lnkdhashmap(){
        LinkedHashMap<Object,Object> l2=new LinkedHashMap<>();
        l2.put("Smoke",10);
        l2.put("sanity",30);
        l2.put("regression",10);
        System.out.println(l2);
        l2.put("smoke",10);
        l2.put("smoke",10);
        l2.put("smoke",10);
        System.out.println("duplicate key with a unique value");
        l2.put("smoke",40);
        System.out.println(l2);
        System.out.println("duplicate value with a unique key");
        System.out.println(l2.put("smoke",30));
        System.out.println("these are keys");
        System.out.println("adding whitebox");
        System.out.println(l2.put("whitebox",10));
        // null
        System.out.println("adding null value"+l2.put("sanity",null));
        System.out.println("adding null key"+l2.put(null,10));


Iterator i3=l2.keySet().iterator();
        while (i3.hasNext()){
            System.out.println(i3.next());
        }
        System.out.println("these are values");
Iterator i4=l2.values().iterator();
        while(i4.hasNext()){
            System.out.println(i4.next());
        }
        System.out.println(l2);
    }

    public static void main(String[] args) {
        LinkedhashMap1 l1=new LinkedhashMap1();
        l1.lnkdhashmap();
    }
}
