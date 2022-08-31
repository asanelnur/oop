import java.math.BigDecimal;

public class fourth {
    public static void main(String[] args) {
        int x=6;
        Integer y = new Integer("6");
        System.out.println(y);
        Integer[] intArray={new Integer(2),new Integer(4),new Integer(3)};
        Integer[] intArray1={2,4,3};
        System.out.println(intArray);
        System.out.println(intArray1);
        BigDecimal a=new BigDecimal("922337213827626");
        BigDecimal b=new BigDecimal("2");
        BigDecimal c=a.multiply(b);
        System.out.println(c);
        String message="Hello World!";
        String s1="Welcome to Java";
        String s2=new String("Welcome to Java");
        String s3="Welcome to Java";
        System.out.println("s1==s2 is "+(s1==s2));// because s1 and s2 are addresses.
        System.out.println("s1==s3 is "+(s1==s3));

        System.out.println("s1.value == s2.value is "+(s1.equals(s2)));
        System.out.println("s1.value == s3.value is "+(s1.equals(s3)));
    }
}
//The wrapper classes do not have no-arg constructors.
//Integer,Double,String,... classes.