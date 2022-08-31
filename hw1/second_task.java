import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class second_task {
    public static void main(String[] args) {
        String processed_file_name=null;
        try{
            Scanner input=new Scanner(new File("input1.txt"));
            processed_file_name="input1.txt";
            while(input.hasNextLine()){
                String s=input.nextLine();
                System.out.println(s);
            }
            input.close();
        }catch(FileNotFoundException ex1){
            try{
                Scanner input=new Scanner(new File("input2.txt"));
                processed_file_name="input2.txt";
                while(input.hasNextLine()){
                    String s=input.nextLine();
                    System.out.println(s);
                }
                input.close();
            }catch(FileNotFoundException ex2){
                System.out.println("Files don't exict");
            }
        }
        finally{
            if(processed_file_name!=null)
                System.out.println("The name of the successfully processed file: "+processed_file_name);
            }
    }    
}
