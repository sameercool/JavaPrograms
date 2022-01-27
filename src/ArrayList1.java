import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList1 {
    public void am1(){
// we are creating an arraylist
        ArrayList<String> a2=new ArrayList<>();
//we are adding the elements to the arraylist

        a2.add("Josh");
        a2.add("Anna");
        a2.add("Seth");
        a2.add("Dave");
        a2.add("lily");

//for each loop gives access for only forward iteration
        //advantage of for each loop forward iteration and simple to write
        //disadvantage cannot do reverese iteration
        for (String f1: a2) {
            System.out.println(f1);
        }

//we will be using list iterator now
        System.out.println("we are into list iterator now");
        ListIterator l1= a2.listIterator();
        while (l1.hasNext()){
            System.out.println(l1.next());
        }




    }
    public static void main(String[] args) {
        //creating a constructor object
        ArrayList1 a1=new ArrayList1();
        //we are calling the method present in the class using the object reference
        a1.am1();
    }
}
