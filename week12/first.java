/*Generics-is the capability to parameterize types
with this capability, you can define a class or a method with generics types
that can be replaced using concrete types by the compiler.
The key benefit of generics is to enable errors to be detected at compile time rather at runtime. 
*/  
import java.util.ArrayList;

public class first {
    public static void main(String[] args) {
        //ArrayList list = new ArrayList(); Note: first.java uses unchecked or unsafe operations.
        ArrayList<Object> list=new ArrayList<Object>();
        list.add(123);
        list.add("Text");
        list.add(new Circle());
        System.out.println(list);
    }
}

class Circle{}