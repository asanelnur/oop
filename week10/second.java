import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int number1=input.nextInt();
        int number2=input.nextInt();

        int result=quotient(number1, number2);
        System.out.println(number1+" / "+number2+" = "+result);

        input.close();
    }
    public static int quotient(int num1,int num2){
        if(num2==0){
            System.out.print("Divisor cannot be zero");
            System.exit(1);
        }
        return num1/num2;
    }
}
