public class third {
    public static void main(String[] args) {
        Apple a=new Apple();
        System.out.println("End of main!");
    }
}

class Apple extends Fruit{
    Apple(){
        //System.out.println("Start of Apple!"); It is not allowed!
        super("Apple is created!"); //new Fruit this class is automatically called: super()- no-arg constructor
        System.out.println("End of Apple!");
    }
}
class Fruit{
    public Fruit(String s){ //problem is we have to call Fruit constructor without arguments.
        System.out.println("Fruit is created!");
        System.out.println(s);
    }
}