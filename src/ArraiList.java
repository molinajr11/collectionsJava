import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.sort;

public class ArraiList {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<Integer>();
        List<Integer> numbersPair=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }
        for(int i : numbers) {
            if(i%2==0){
                numbersPair.add(i);;

            }
        }
        numbersPair.sort(Collections.reverseOrder()); // sort reversed

        //println("")
        for (int i : numbersPair) {
            System.out.println("numerosPares= " + i);
        }

        //array to arrayList

        String[] text={"Numeros","cosas","sinas"};
        ArrayList arrayList=new ArrayList(Arrays.asList(text));
        System.out.println("array to arrayList = " + arrayList);

    }
}
