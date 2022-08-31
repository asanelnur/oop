import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class third_task{
    public static void main(String[] args) {
        int cnt_lines=0;
        int cnt_words=0;
        try{
            Scanner input1=new Scanner(new File("input.txt"));
            Scanner input2=new Scanner(new File("input.txt"));
            while(input1.hasNextLine()){
                input1.nextLine();
                cnt_lines++;
            }
            while(input2.hasNext()){
                input2.next();
                cnt_words++;
            }
        }catch(FileNotFoundException ex1){
            System.out.println("Input file doesn't exict");
        }
        catch(IllegalStateException state) {
            System.err.println("Couldn't read from file");
        }

        try{
            java.io.PrintWriter output=new java.io.PrintWriter("output.txt");
            output.println("Lines "+cnt_lines);
            output.print("Words "+cnt_words);
            output.close();
        }catch(FileNotFoundException ex){
            System.out.println("Output file doesn't exict");
        }
    }
}