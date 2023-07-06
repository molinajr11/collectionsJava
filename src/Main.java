import java.util.ArrayList;
import java.util.Collection;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Collection<Person> persons= new ArrayList<Person>();
        persons.add(new Person ("Juan", 20));
        persons.add(new Person ("Esteban", 22));
        persons.add(new Person ("Mar", 23));

       int size= persons.size();
       System.out.println("size = " + size);

      Collection<Person> persons2= new ArrayList<Person>();
      persons2.add(new Person  ("carlos", 20));
      persons2.add(new Person ("maria", 17));
      persons2.add(new Person ("magdalena",34));


      persons.addAll(persons2);
      //
      for (Person person : persons) {System.out.println(person.name);}
    }

    public static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}

