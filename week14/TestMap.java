import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashmap=new HashMap<>();
        hashmap.put("Smith",30);
        hashmap.put("Anderson",25);
        hashmap.put("Lewis",20);
        hashmap.put("Cook",29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashmap+"\n");

        Map<String,Integer> treemap=new TreeMap<>(hashmap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treemap+"\n");

        Map<String,Integer> linkedhashmap=new LinkedHashMap<>(hashmap);
        System.out.println("Display entries in LinkedHashMap");
        System.out.println(linkedhashmap+"\n");
    }
}
