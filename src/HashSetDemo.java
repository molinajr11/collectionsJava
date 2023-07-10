import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs= new HashSet(); // default capacity 16 Load factor 0.75
        HashSet <Integer> hs2= new HashSet(100); // inicial capacity.
        HashSet <Integer> hs3= new HashSet(100,(float) 0.90); // inicial capacity and load factor.

        hs.add(100);
        hs.add("Hi");
        hs.add(24.5);
        hs.add(true);
        hs.add(null);
        hs.add('M');
        System.out.println("HashSet = " + hs);
        for (int i=0; i<=100; i++){
            hs2.add(i);
        }
        for(int i=0; i<= hs2.size(); i++){
            if(i%2==0){
                hs3.add(i);
        }
        }
        for (int e:hs3) {
            System.out.println("pares = " + e);

        }


    }
}
