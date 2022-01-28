package Colllections;

import java.util.LinkedList;

public class StackLIFO {
    public void stackMethod(){
LinkedList<Integer>  l1=new LinkedList<>();
l1.push(10);
l1.push(20);
l1.push(30);
l1.push(40);
l1.push(50);
        System.out.println(l1);
        System.out.println("after using pop method");
        System.out.println(l1.pop());
        System.out.println(l1.pop());
        System.out.println(l1.pop());
        System.out.println(l1.pop());
        System.out.println(l1.pop());

    }

    public static void main(String[] args) {
        StackLIFO s1=new StackLIFO();
        s1.stackMethod();
    }
}
