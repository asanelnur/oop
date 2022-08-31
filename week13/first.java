import java.util.ArrayList;
import java.util.Collection;

//A collection is a container object that holds group of objects , often referred to as elements. 
//The Java Collections Framework suports three types of collections,named lists,sets, and maps. 

// interface F{}
// interface G extends F{}
public class first{
    public static void main(String[] args) {
        ArrayList<String> collection1=new ArrayList<>();
        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");

        System.out.print("A list of cities in collections1: ");
        System.out.println(collection1);

        System.out.println("Is Dallas in collection1 ?"+collection1.contains("Dallas"));

        Collection<String> collection2=new ArrayList<>();
        collection2.add("New York");
        collection2.add("Atlanta");
        collection2.add("Dallas");

        System.out.print("A list of cities in collections2: ");
        System.out.println(collection2);
    }
}
