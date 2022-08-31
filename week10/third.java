import java.util.Scanner;
public class third {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int number1=input.nextInt();
        int number2=input.nextInt();

        try{
            int result=quotient(number1, number2);
            System.out.println(number1+" / "+number2+" = "+result);
        }catch(ArithmeticException ex){
            System.out.println("Exception: an integer "+ "cannot be divided by zero.");
        }

        System.out.println("Exucation continues ...");
        input.close();
    }
    public static int quotient(int num1,int num2){
        if(num2==0){
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return num1/num2;
    }
}
