import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedLystDemo {
    public static void main(String[] args) {
        // heterogeneous data structure
        LinkedList l = new LinkedList();
        l.add(100);
        l.add("welcome");
        l.add('A');
        l.add(true);
        l.add(null);

        System.out.println(l);
        System.out.println(l.size() +" size before removing");
        l.remove(1); // remove by index
        System.out.println(l.size()+" size after removing");

        l.add(1,"esteban"); // add by index
        System.out.println(l);
        System.out.println(l.get(3) +" get element index");

        l.set(3,"Molina"); // set by index
        System.out.println("l after change = " + l);

        System.out.println(l.contains("esteban")+" metodo contains");

        for (int index=0; index<l.size(); index++){
            System.out.println(l.get(index));
        }

        LinkedList <String> list = new LinkedList<String>();
        list.add("X");
        list.add("Y");
        list.add("Z");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");

        Collections.sort(list);
        System.out.println("list sort = " + list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("list reverse order =  " + list);
        Collections.shuffle(list);
        List<String> list2 = new ArrayList<String>();
        for(String e : list){
            if(e.equals("A")){
                list2.add(e);
            }
        }
        System.out.println("list2  = " + list2);

    }

}

