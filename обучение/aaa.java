//import java.lang.String;
//import java.util.Scanner;

public class aaa{
    public static void main(String[] args) {
        /*
        переменные:

        byte num=23;
        int num_1=4352627;

        float num_2=23.45f;
        double num_3=21.1212132323232d;

        boolean isTrue=true;

        char sym='R';

        String str="Hello world!";

        System.out.println(num);
        System.out.println(num_1);
        System.out.println(num_2);
        System.out.println(num_3);
        System.out.println(isTrue);
        System.out.println(sym);
        System.out.println(str);
        */


        /*
        Данные от пользователя:

        Scanner str= new Scanner(System.in);
        System.out.println("Your string is: " + str.nextLine());

        Scanner num= new Scanner(System.in);
        int ans=num.nextInt()*2;
        System.out.print(ans);
        num.close();
        */
        
        
        /*
        Математические операции:

        Scanner num=new Scanner(System.in);
        int first,second,result;
        System.out.println("Enter first num: ");
        first=num.nextInt();
        System.out.println("Enter second num: ");
        second=num.nextInt();
        result=first+second;
        result /= 2;
        result++;
        result--;
        System.out.println("Result is: "+ result);
        num.close();
        */

        
        /*
        Условные операторы:

        Scanner num=new Scanner(System.in);
        int first,second=50;
        boolean isTrue=false;
        System.out.print("Enter first number: ");
        first=num.nextInt();
        //isTrue=first<second ? true : false;
        isTrue=first<second;
        if(first==0){
            System.out.println("Number is't even and odd,because number is zero");
        }else if(first%2==0 && isTrue){
            System.out.println("Number is even and lower than 50");
        }else if(isTrue){
            System.out.println("Number is odd and lower than 50");
        }else{
            System.out.println("Number bigger than 50");
        }
        switch(first){
            case 51:
                System.out.println("Number is equal to 51");
                break;
            case 48:
                System.out.println("Number is equal to 48");
                break;
            case 40:
                System.out.println("Number is equal to 40");
                break;
            default:
                System.out.println("Number is equal to something");
        }
        num.close();
        */
        

        /*
        Циклы:

        for(int i=1;i<=10;i++)
            if(i%2==1)
                System.out.print(i+" ");
        for(int i=100;i>0;i-=10)
            System.out.print(i+" ");
        int i=1;
        while(i<=10){
            if(i>10)
                break;
            if(i%2==0){
                i++;
                continue;
            }
            System.out.print(i+" ");
            i++;
        }
        int x=0;
        do{
            System.out.print(x);
            x++;
        }while(x<0);
        */
    }
}