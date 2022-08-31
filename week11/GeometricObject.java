public abstract class GeometricObject{
    private String color="white";
    private boolean filled;
    private java.util.Date dateCreated;

    // Constract a default geometric object
    protected GeometricObject(){
        dateCreated=new java.util.Date();
    }

    protected GeometricObject(String color,boolean filled){
        dateCreated=new java.util.Date();
        this.color=color;
        this.filled=filled;
    }

    // Return color
    public String getColor(){
        return color;
    }

    // Set color
    public void setColor(String c){
        color=c;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean f){
        filled=f;
    }

    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    @Override
    public String toString(){
        return "created on "+dateCreated+"\ncolor: "+color+"and filled: "+filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}