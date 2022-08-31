import java.util.Random;

public class second {
    public static void main(String[] args) {
        final int x=3; //constant value;
        System.out.println(x);
        //x++; error: cannot assign a value to final variable x
        //System.out.println(x);
        
        //Math m = new Math();
        System.out.println(Math2.a);
        Math2.a=2;
        //System.out.println(Math.a);
        Math2.printa();

        System.out.println(java.lang.Math.random());
        Random r=new Random();
        System.out.print(r.nextInt(1000));
    }
}
final class Math2{
    static int a=1;
    static void printa(){
        System.out.println(a);
    }
}