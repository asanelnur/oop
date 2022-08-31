import java.io.FileNotFoundException;
import java.util.Scanner;

public class first_task{
    public static void main(String[] args) {
        try{
            java.io.File file=new java.io.File("input.txt");
            Scanner input=new Scanner(file);
            while(input.hasNextLine()){
                String s=input.nextLine();
                System.out.println(s);
            }
            input.close();
        }
        catch(FileNotFoundException ex1){
            System.out.println("File doesn't exict");
        }
        catch(IllegalStateException state) {
            System.err.println("Couldn't read from file");
        }
    }
}