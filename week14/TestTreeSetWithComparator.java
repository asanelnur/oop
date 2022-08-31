import java.util.Comparator;
import java.util.TreeSet;
import java.util.Set;
public class TestTreeSetWithComparator {
    public static void main(String[] args) {
        Set<GeometricObject> set = new TreeSet<GeometricObject>(new GeometricObjectComparator());
        set.add(new Rectangle(4.0,5.0));
        set.add(new Circle(40.0));
        set.add(new Rectangle(5.0,4.0));
        set.add(new Circle(40.0));
        set.add(new Rectangle(13.0,2.0));
        set.add(new Rectangle(3.0,2.0));
        set.add(new Rectangle(10.0,2.0));
        set.add(new Rectangle(1.0,2.0));
        for(GeometricObject element: set){
            System.out.print("area="+element.getArea()+"    ");
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