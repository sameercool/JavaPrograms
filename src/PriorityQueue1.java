import java.util.PriorityQueue;

public class PriorityQueue1 {
    public void prquMethod(){
        PriorityQueue<Integer> p2=new PriorityQueue<>();
        p2.add(3);
        p2.add(2);

        p2.add(1);

        p2.add(4);

        System.out.println(p2.peek());
        System.out.println("after using poll");
        System.out.println(p2.poll());
        System.out.println("after deleting");
        System.out.println(p2.peek());
        System.out.println(p2.contains(1));
    }

    public static void main(String[] args) {
        PriorityQueue1 p1=new PriorityQueue1();
        p1.prquMethod();

    }
}
