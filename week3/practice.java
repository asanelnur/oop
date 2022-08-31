public class practice {
    public static void main(String[] args) {
        Studeent s1= new Studeent("19b026728","Arman",3,3.56f);
        System.out.print(s1.id+" ");
        System.out.print(s1.name+" ");
        System.out.print(s1.cource+" ");
        System.out.print(s1.gpa+" ");
        s1.getnumbersofobjects();

        Studeent s2= new Studeent("18b098734","Daulet",4,3.28f);
        System.out.print("\n"+ s2.id+" ");
        System.out.print(s2.name+" ");
        System.out.print(s2.cource+" ");
        System.out.print(s2.gpa+" ");
        s2.getnumbersofobjects();

        Studeent s3= new Studeent("18b098734","Daulet",4,3.28f);
        System.out.print("\n"+ s3.id+" ");
        System.out.print(s3.name+" ");
        System.out.print(s3.cource+" ");
        System.out.print(s3.gpa+" ");
        s3.getnumbersofobjects();

        s1.getnumbersofobjects();
    }
}
class Studeent{
    String id;
    String name;
    int cource;
    float gpa;
    static int numberofobjects=0;
    Studeent(){
    }
    Studeent(String i,String n,int c,float g){
        id=i;
        name=n;
        cource=c;
        gpa=g;
        numberofobjects++;
    }
    void getidandgpa(){
        System.out.println(id + " " + gpa);
    }
    void getnameandcourse(){
        System.out.println(name + " " + cource);
    }
    void getnumbersofobjects(){
        System.out.println(numberofobjects);
    }
}