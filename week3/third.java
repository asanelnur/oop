public class third {
    public static void main(String[] args) {
        B a=new B();//initialize object
        System.out.println(a.x);
        B b=new B();
        System.out.println(b.x);
        B c=b;
        System.out.println(c.x);
        b.x=10;
        System.out.println(b.x);
        System.out.println(c.x);
    }
}

class B{
    int x;
    void f(){
        //int x;
        //System.out.println(x); //  error: variable x might not have been initialized
        System.out.println(this.x);
    }
}