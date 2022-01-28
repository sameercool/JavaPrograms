package Map;

import java.util.TreeMap;

public class TreeMap1 {
    public void treeM(){
        TreeMap<Object,Object> t2=new TreeMap<>();
        t2.put("john",100);
        t2.put("jason",20);
        t2.put("George",10);
        System.out.println(t2.keySet());
        System.out.println(t2.values());
        System.out.println(t2.containsKey("sara"));
        System.out.println(t2.put(null,10));
        t2.put("john",100);
        System.out.println("adding duplicates "+t2);
    }

    public static void main(String[] args) {
        TreeMap1 t1=new TreeMap1();
        t1.treeM();
    }
}
