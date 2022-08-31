import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class fifth {
    public static void main(String[] args){// throws FileNotFoundException{
        try{
            Scanner input=new Scanner(new File("input.txt"));
            input.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("File doesn't exict");
        }
    }
}