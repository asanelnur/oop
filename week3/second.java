public class second {
    public static void main(String[] args) {
        A a=new A();//initialize object
        int x=2;//iniatilize variable
        //int x=3; it is not allowed: correct->x=3;
        System.out.println(a.x);
        System.out.println(x);
        a.f();
    }
}

class A{
    int x;
    void f(){
        //int x;
        //System.out.println(x); //  error: variable x might not have been initialized
        System.out.println(this.x);
    }
}
