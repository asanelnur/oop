public class first{
    public static void main(String[] args){
        Circle circle1=new Circle();
        System.out.println(circle1.getArea());
        Circle circle2=new Circle(3.23d);
        System.out.println(circle2.getArea());
        Circle circle3=new Circle(2);
        System.out.println(circle3.getArea());
    }
}
class Circle{
    double radius=1.0;  // 1 data field
    Circle(){}
    Circle(double newradius){
        radius=newradius;
    }                   // 2 constructors
    double getArea(){
        return radius*radius*Math.PI;
    }                   // 3 methods(2 constructor and 1 method)
}