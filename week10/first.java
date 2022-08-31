import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int number1=input.nextInt();
        int number2=input.nextInt();

        //RuntimeException
        if(number2!=0){
            System.out.println(number1+" / "+number2+" = "+(number1/number2));
        }else{
            System.out.println("Divisor connot be zero");
        }
        input.close();
    }
}
