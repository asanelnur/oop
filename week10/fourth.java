import java.util.InputMismatchException;
import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean continueInput=true;
        do{
            try{
                System.out.print("Enter an integer: ");
                int number=input.nextInt();

                System.out.print("The entered number is "+number);

                continueInput=false;
            }catch(InputMismatchException ex){
                System.out.println("Try again. (Incorrect input: an integer is required)");
                input.nextLine();
            }
        }while(continueInput);

        input.close();
    }
}

/*
method2() throw Exception{
    if(an error){
        throw new Exception();
    }
}

throw new TheException();

TheException ex = new TheException();
throw ex;

try{
    statements;
}catch(Exception1 exVar1){
    handler for exception1;
}
catch(Exception2 exVar2){
    handler for exception2;
}
catch(Exception3 exVar3){
    handler for exception3;
}
*/

/* 
         Exception-describes errors caused by your program and external circumstances.(ClassNotFoundException,IOException,RuntimeException,e.c.)
       /
Object
       \ 
         Error-system error: computer, phisical.

RuntimeException ,Error and their subclasses are known as as unchecked.
*/