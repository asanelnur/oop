//import java.util.*;
//import java.util.Scanner;
public class TestSimpleCircle{
    public static void main(String[] args){
        SimpleCircle circle1=new SimpleCircle();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getarea() );
        SimpleCircle circle2=new SimpleCircle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getarea());
        SimpleCircle circle3=new SimpleCircle(5);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getarea());
        circle2.radius=100;
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getarea());
        Rectangle r1=new Rectangle();
        System.out.println(r1.width);
        r1.width=2;
        System.out.println(r1.width);
    }
}
class SimpleCircle{
    double radius;
    SimpleCircle(){
        radius=1.0;
    }
    SimpleCircle(double newRadius){
        radius=newRadius;
    }
    double getarea(){
        return radius*radius*Math.PI;
    }
    double getperimeter(){
        return 2*radius*Math.PI;
    }
    void setradius(double newRadius){
        radius=newRadius;
    }
}
class Rectangle{
    int width;
}