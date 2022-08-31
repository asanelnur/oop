public class Circle extends GeometricObject{
    private double radius;
    public Circle(){}
    public Circle(double radius){
        this.radius=radius;
    }

    //Return radius
    public double getRadius(){
        return radius;
    }

    //Set a new radius
    public void setRadius(double newradius){
        radius=newradius;
    }

    @Override
    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

}