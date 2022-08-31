public class second {
    public static void main(String[] args) {
        Apple a = new Apple();
        System.out.println(a.toString());

        Fruit f=new Fruit();
        System.out.println(f);

        Object o=new Object();
        System.out.println(o);
    }
}
class Apple extends Fruit{
    @Override
    public String toString(){
        return "This is a apple";
    }
}
class Fruit{
    @Override
    public String toString(){
        return "This is a fruit";
    }
}        
// equivalent to :     class Fruit extends Object{                
//                     }