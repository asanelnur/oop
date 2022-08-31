/*public class Circle extends GeometricObject{
    // Other methods are omitted

    // Override the toString method defined in Geometric object

    @Override // it is not unnessary but it is requared.
    public String toString(){
        return super.toString()+"\nradius is "+radius;
    }
}*/
public class first{
    public static void main(String[] args) {
        A a = new A();
        a.p(10);
        a.p(10.0);
        System.out.println("--------");
        a.h(10);
        a.h(10.0);
    }
}
class B{
    public void p(double i){
        System.out.println(i*2);
    }

    public void h(double i){ 
        System.out.println(i*2);
    }
}
class A extends B{
    //This method overrides the method in B;
    public void p(double i){
        System.out.println(i);
    }

    //This method overloads the method in B;
    public void h(int i){
        System.out.println(i);
    }
}
