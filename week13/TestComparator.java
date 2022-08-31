import java.util.Comparator;

public class TestComparator {
    public static void main(String[] args) {
        GeometricObject g1=new Rectangle(5.0,9.0);
        GeometricObject g2=new Circle(3.0);

        GeometricObject g=max(g1,g2,new GeometricObjectComparator());

        System.out.print(g.getArea());
    }
    public static GeometricObject max(GeometricObject g1,GeometricObject g2,Comparator<GeometricObject> c){
        if(c.compare(g1, g2)>0){
            return g1;
        }
        else{
            return g2;
        }
    }
}

class GeometricObject{
    public String color;
    
    GeometricObject(){
    }

    public double getArea(){
        return 1.0;
    }
}

class Rectangle extends GeometricObject{
    protected double height;
    protected double weidth;
    Rectangle(double h,double w){
        height=h;
        weidth=w;
    }
    public double getArea(){
        return height*weidth;
    }
}

class Circle extends GeometricObject{
    protected double radius;
    Circle(double r){
        radius=r;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}

class GeometricObjectComparator implements Comparator<GeometricObject> , java.io.Serializable{
    public int compare(GeometricObject o1,GeometricObject o2){
        double area1=o1.getArea();
        double area2=o2.getArea();
        if(area1<area2)
            return -1;
        else if (area1==area2){
            return 0;
        }
        else{
            return 1;
        }
    }
}