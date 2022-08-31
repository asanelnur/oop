public class Application {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(3,4);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        r.setA(5);
        r.setB(7);
        System.out.println(r.getA()*r.getB());
        System.out.println(2*(r.getA()+r.getB()));
    }
}
