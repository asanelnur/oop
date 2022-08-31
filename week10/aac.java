import java.io.FileNotFoundException;
import java.util.Scanner;

public class aac {
    public static void main(String[] args) throws FileNotFoundException{
        java.io.File file=new java.io.File("scores.txt");

        Scanner input=new Scanner(file);
        while(input.hasNext()){
            String first_name=input.next();
            String middle_name=input.next();
            String last_name=input.next();
            int score=input.nextInt();
            System.out.println(first_name+" "+middle_name+" "+last_name+" " +score);
        }

        input.close();
    }
}
/*
URL url=new URL("www.google.com");
Scanner input=new Scanner(url.openStream);
*/