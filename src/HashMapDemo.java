import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap <Integer,String> m = new HashMap <Integer,String>();
        for (int i = 0; i < 10; i++) {
            int key=i;
            String value = "JEM"+i;
            m.put(key,value);
        }
        System.out.println(m);
        System.out.println("get by key: "+m.get(8));
        System.out.println("Contains x key: "+ m.containsKey(0));
        System.out.println("Contains x value: "+m.containsValue("JEM7"));
        System.out.println("True or false if is empty: "+m.isEmpty());
        System.out.println("Return all the keys "+m.keySet());
        System.out.println("Return all the values as collection "+m.values());
        System.out.println("Return all the entries as set"+m.entrySet());

        // Entry methods
        for (Map.Entry entry: m.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
