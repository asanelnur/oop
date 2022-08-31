//Polimorphism
//Polimorphism means that a variable of a supertype can refer to a subtype object.
// A class  defines a type. A type defined by a subclass is called a subtype,
// and type defined by a superclass is called a supertype.Therefor
public class third {
    public static void main(String[] args) {
        Fruit2 f1=new Apple2(); //This is a polimorphism
        System.out.println(f1);
        //System.out.println(f1.Whatisit()); <----- error
        Fruit2 f2=new Banana();
        System.out.println(f2);

        //Apple2 a = new Fruit2(); This way doesn't work. It must be from parent class to child class.
        System.out.println("----------------------------");

        Fruit2[] fruits={f1,f2,new Apple2(),new Banana(),new Orange()};
        for(Fruit2 fruit: fruits){
            System.out.println(fruit);
        }

        Fruit2 fruit=new Apple2();
        Apple2 x=(Apple2)fruit;//Casting from Superclass to Subclass.
        System.out.println(x);
    }
}
class Banana extends Fruit2{
    //@Override
    public String toString(){
        return "This is a banana";
    }
    public String Whatisit(){
        return "Banana";
    }
}
class Apple2 extends Fruit2{
    @Override
    public String toString(){
        return "This is a apple";
    }
    public String Whatisit(){
        return "Apple";
    }
}
class Fruit2{
    @Override
    public String toString(){
        return "This is a fruit";
    }
} 

class Orange extends Fruit2{
    //@Override
    public String toString(){
        return "This is a orange";
    }
    public String Whatisit(){
        return "Orange";
    }
}