public class third {
    public static void main(String[] args) {
        Studeent s1=new Studeent("A");
        System.out.println(s1.printname());
        System.out.println(s1.getgpa());
        s1.setgpa(3);
        System.out.println(s1.getgpa());
    }
}

class Studeent{
    private String name;
    public String id;
    private double gpa=4;
    String specialty;
    Studeent(){}
    Studeent(String n){
        name=n;
    }
    public double getgpa(){
        return gpa;
    }
    public void setgpa(double gpa){
        this.gpa=gpa;
    }
    public String printname(){
       return name;
    }
}