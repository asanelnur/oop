import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.File;

public class fourth_task {
    public static void main(String[] args) {
        ReadProcessor readfile=new ReadProcessor();
        try{
            readfile.execute();
        }catch(MyIllegalStateException ex){
            System.out.println("There is a problem");
        }
        WriteProcessor out=new WriteProcessor();
        try{
            out.execute();
        }catch(MyIllegalStateException ex){
            System.out.println("Text is null");
        }
    }
}

class MyFileProcessor{
    public static String text="";
    public MyFileProcessor(){
    }
    public void execute() throws MyIllegalStateException{
    }
}

class ReadProcessor extends MyFileProcessor{
    public ReadProcessor(){}
    
    public void execute() throws MyIllegalStateException{
        try{
            Scanner input=new Scanner(new File("input.txt"));
            while(input.hasNext()){
                text+=input.next()+" ";
            }
        }catch(FileNotFoundException ex){
            System.out.println("File doesn't exict");
        }catch(NoSuchElementException ex){
            System.out.println("No such elements");
        }
    }
}

class WriteProcessor extends MyFileProcessor{
    public WriteProcessor(){}
    public void execute() throws MyIllegalStateException{
        if(text==""){
            throw new MyIllegalStateException();
        }
        try{
            java.io.PrintWriter output=new java.io.PrintWriter("output.txt");
            output.print(text);
            output.close();
            
        }catch(FileNotFoundException ex){
            System.out.println("File doesn't exict");
        }
    }

}

class Exception_java extends Throwable{
}

class MyIllegalStateException extends Exception_java{
    public MyIllegalStateException(){}
}