//Chapter 11:
//Inheritance and Polymorphism
//Inheritance-наследование
//Polymorphism-
public class second{
    public static void main(String[] args) {
        Circle c=new  Circle(3.12d,"black",true);
        //System.out.println(c.getCreated());
        System.out.println("Radius = "+c.getRadius()+"\nArea = "+ c.getArea()+"\n"+c.toString());

        System.out.println("----------------------------------");

        Rectangle r=new Rectangle(2.0,3.0,"green",true);
        System.out.println("height= "+r.getHeight()+"  weight= "+r.getWeight()+"\nArea = "+r.getArea());
        System.out.println(r.toString());

        System.out.println("----------------------------------");

        Rectangle r1=new Rectangle(2.0,3.0);
        System.out.println("height= "+r1.getHeight()+"  weight= "+r1.getWeight()+"\nArea = "+r1.getArea());
        System.out.println(r1.toString());
    }
}
class SimpleGeometricObject{
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;
    public SimpleGeometricObject(){
        dateCreated=new java.util.Date();
    }
    public SimpleGeometricObject(String color,boolean filled){
        this.color=color;
        this.filled=filled;
        dateCreated=new java.util.Date();
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public java.util.Date getCreated(){
        return dateCreated;
    }
    public String toString(){
        return "created on: "+dateCreated+"\ncolor: "+color+"\nfilled: "+filled;
    }
}
class Circle extends SimpleGeometricObject{
    private double radius;

    Circle(){
        //super(): new SimpleGeometricObject()
        //this()
    }

    Circle(double radius){
        //super(): new SimpleGeometricObject()
        this.radius=radius;
    }

    Circle(double radius,String color,boolean filled){
        //super(): new SimpleGeometricObject()
        //super(color, filled);
        this.radius=radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
}
class Rectangle extends SimpleGeometricObject{
    private double height;
    private double weight; 

    Rectangle(){};

    Rectangle(double height,double weight){
        this.height=height;
        this.weight=weight;
    }

    Rectangle(double height,double weight,String color,boolean filled){
        this.height=height;
        this.weight=weight;
        setColor(color);
        setFilled(filled);
    }

    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }

    public double getArea(){
        return height*weight;
    }

    public double getPerimeter(){
        return 2*(height+weight);
    }
}