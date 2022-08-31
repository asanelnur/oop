public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject circle=new Circle(5);
        GeometricObject rectangle=new Rectangle(4,3); //Polimorphism 
        displayGeometricObject(circle);
        displayGeometricObject(rectangle);

        System.out.println();
        System.out.println("The to objects have the same area? : "+equalArea(circle,rectangle));

        GeometricObject[] geoobjects=new GeometricObject[10];
        System.out.println(geoobjects[0]);
        //geoobjects=new GeometricObject();  <- It is wrong!
        for(int i=0,k=1;i<10;i++){
            geoobjects[i]=new Circle(k++);
        }
        for(GeometricObject obj: geoobjects){
            System.out.println(obj.getArea());
        }
    }   
    
    public static boolean equalArea(GeometricObject object1,GeometricObject object2){
        return object1.getArea()==object2.getArea();
    }

    public static void displayGeometricObject(GeometricObject object){
        System.out.println();
        System.out.println("The area is "+object.getArea());
        System.out.println("The perimeter is "+ object.getPerimeter());
    }
}

/*
  You cannot create an intance from an abstract class using the
new operator, but an abstract class can be used as a date type.

GeometricObject[] geo=new GeometricObjact[10];


*/