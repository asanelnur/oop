/*
   A set is an efficient data structure for storing and processing nonduplicate elements. Always e1.equals(e2)=false;
   Concrete classes of set: HashSet, LinkedHashSet, TreeSet.
   HashSet - unordered, unsorted.
   LinkedHashSet - ordered, unsorted.
   TreeSet - sorted. 

   A map is like a dictionary that provides a quick lookup to retrieve a value using a key.
*/
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestMethodInCollection{
    public static void main(String[] args) {
        Set<String> set1=new HashSet<>();
        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("San Francisco");
        set1.add("Beijing");
        set1.add("Moskow");
        set1.add("Madrid");

        System.out.println(set1.size()+" elements in set1");
        System.out.println("set1 is "+set1);

        set1.remove("London");
        System.out.println(set1.size()+" elements in set1");
        System.out.println("set1 is "+set1);

        System.out.println("Is London in set1? "+set1.contains("London"));

        System.out.println("-------------------------------------------------------------------");

        Set<String> set2=new HashSet<>();
        set2.add("Astana");
        set2.add("Almaty");
        set2.add("Moskow");
        set2.add("Madrid");
        set2.add("Barselona");
        set1.add("San Francisco");
        set1.add("Beijing");
        set1.removeAll(set2);
        System.out.println("set2 is "+set2);
        System.out.println("set1 is "+set1);

        System.out.println("-------------------------------------------------------------------");

        Set<Integer> ints=new TreeSet<>();
        ints.add(5);
        ints.add(2);
        ints.add(13);
        ints.add(1);
        ints.add(1);
        ints.add(9);
        System.out.println(ints);

        System.out.println("-------------------------------------------------------------------");

        Set<Integer> lints=new LinkedHashSet<>();
        lints.add(5);
        lints.add(2);
        lints.add(13);
        lints.add(1);
        lints.add(1);
        lints.add(9);
        System.out.println(lints);

        System.out.println("-------------------------------------------------------------------");

        Set<String> set3=new LinkedHashSet<>();
        set3.add("London");
        set3.add("Paris");
        set3.add("New York");
        set3.add("San Francisco");
        set3.add("Beijing");
        set3.add("Moskow");
        set3.add("Madrid");
        System.out.print(set3);
    }
}