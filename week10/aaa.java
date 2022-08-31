public class aaa {
    public static void main(String[] args) {
        try{
            CircleWithException c1=new CircleWithException(5);
            CircleWithException c2=new CircleWithException(-5);
            CircleWithException c3=new CircleWithException(0);
        }
        catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex);
        }

        System.out.println("Number of objects created: "+ CircleWithException.getNumberOfObjects());
    }
}
class CircleWithException{
    private double radius;
    public static int NumberOfObjects;
    public CircleWithException(){
        this(1.0);
    }
    public CircleWithException(double r){
        setRadius(r);
        NumberOfObjects++;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r) throws IllegalArgumentException{
        if(r>=0){
            radius=r;
        }else{
            throw new IllegalArgumentException("Radius cannot be negative");
        }
    }
    public static int getNumberOfObjects(){
        return NumberOfObjects;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
/*
try{
    Statements;
}
catch(TheException ex){
    handling ex;
}
finally{
    finalStatements;
}

NextStatements;
*/