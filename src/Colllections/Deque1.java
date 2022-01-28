package Colllections;

import java.util.ArrayDeque;

public class Deque1 {
    public void dequeMethod(){
        ArrayDeque<Integer> a2=new ArrayDeque<>();
        a2.add(2);
        a2.add(3);
        a2.add(4);
        System.out.println(a2);
        //I will add element to the first position
        a2.addFirst(1);
        System.out.println("after adding the first element "+a2);
        a2.addLast(5);
        System.out.println("after adding the last element "+a2);
        a2.removeFirstOccurrence(1);
        System.out.println("after removing first element "+a2);
        a2.removeLastOccurrence(5);
        System.out.println("after removing the last element "+a2);
        for (Integer f1:a2
             ) {
            System.out.println(f1);

        }

    }

    public static void main(String[] args) {
        Deque1 d1=new Deque1();
        d1.dequeMethod();
    }
}
