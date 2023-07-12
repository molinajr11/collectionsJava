import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {

    public static void main(String[] args) {
        Hashtable table = new Hashtable(); // capacity 11 , load factors puedo modificar esto con el CTR
        Hashtable<Integer, String> data = new Hashtable<Integer, String>();
        data.put(1,"juan");
        data.put(2,"Esteban");
        data.put(3,"Molina");
        // table.put(null,"Juan");  null pointer exeption
        // table.put(4,"null");  null pointer exeption
        for (Map.Entry entry : data.entrySet())
        {
           System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}


