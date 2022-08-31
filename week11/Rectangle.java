public class Rectangle extends GeometricObject{
    private double width;
    private double heigth;

    public Rectangle(){};

    public Rectangle(double w,double h){
        width=w;
        heigth=h;
    }

    public double getWidth(){
        return width;
    }

    public double getHeigth(){
        return heigth;
    }

    @Override
    public double getArea(){
        return width*heigth;
    }

    @Override
    public double getPerimeter(){
        return 2*(width+heigth);
    }
}
