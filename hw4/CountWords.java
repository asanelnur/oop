import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class CountWords {
    public static void main(String[] args) throws FileNotFoundException{    
        Scanner file=new Scanner(new File("input.txt"));
        Map<String,Integer> hashmap= new HashMap<String,Integer>();
        while (file.hasNext()){
            String word = file.next();
            if(hashmap.containsKey(word)) {
                hashmap.put(word, hashmap.get(word) + 1);
            }else{
                hashmap.put(word, 1);
            }
        }
        File outfile=new File("output.txt");
        PrintWriter output=new PrintWriter(outfile);
        for(String key:hashmap.keySet()){
            output.print(key+" = "+hashmap.get(key)+"\n");
        }
        output.close();
    }
}
