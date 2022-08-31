import java.util.ArrayList;

public class second {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Abc");
        list.add("123");
        System.out.println(list);

        A.func(23, "ABC");
        A.func(1230,"sada");
    }
}

class A{
    static void func(int x,String s){} // parameterize arguments;
}

class StackOfInteger{}
class StackOfString{}
class StackOfFloat{}