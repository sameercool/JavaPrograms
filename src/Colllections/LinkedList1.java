package Colllections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
    public void listMethod(){

        LinkedList<Integer> l2=new LinkedList<>();
        l2.add(20);
        l2.add(30);
        l2.add(40);
        l2.add(500);

        //before removing element
        System.out.println(l2);
        l2.remove(2);
        System.out.println(l2);
l2.addFirst(10);
        System.out.println("after adding");
        System.out.println(l2);
        //removing the last element in linked list
        l2.removeLast();
        System.out.println(l2);
        System.out.println("we are using iterator");

        ListIterator le= l2.listIterator();
        while (le.hasNext()){
            System.out.println(le.next());
        }
    }
    public static void main(String[] args) {
        LinkedList1 l1=new LinkedList1();
        l1.listMethod();
    }
}
