package Map;

import java.util.HashMap;

public class HashMap1 {
    public void hshmp(){
        HashMap<Object,Object> h2=new HashMap<>();
        h2.put(100,"AWS");
        h2.put(200,"SQL");
        h2.put(150,"UNIX");
        System.out.println(h2);
        System.out.println("the keys are "+h2.keySet());
        System.out.println("the values are "+h2.values());
h2.put(100,"AWS");
        System.out.println("after adding the duplicate key value "+h2);
        System.out.println(h2.containsKey(200));
        System.out.println(h2.containsKey(600));
        System.out.println(h2.containsValue("AWS"));
        System.out.println(h2.containsValue("aws"));
    }

    public static void main(String[] args) {
        HashMap1 h1=new HashMap1();
        h1.hshmp();
    }
}
