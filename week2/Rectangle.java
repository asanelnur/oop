public class Rectangle{
    private int a;
    private int b;

    public Rectangle(){
        a=1;
        b=1;
    }

    public Rectangle(int a,int b){
        this.a=a;
        this.b=b;
    }

    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }

    public void setA(int a){
        this.a=a;
    }

    public void setB(int b){
        this.b=b;
    }

    public int getArea(){
        return a*b;
    }

    public int getPerimeter(){
        return 2*(a+b);
    }

    @Override
    public String toString(){
        return "Rectangle: a="+a+", b="+b;
    }
}