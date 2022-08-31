public class fourth{
    public static void main(String[] args) {
        Student s1= new Student("19b401539","KBTU","Arman",3.56f);
        Student s2= new Student("19b026728","KAZNU","Asyl",3.14f);
        Student s3= new Student("18b026478","KAZITU","Bekzat",2.56f);
        s1.shownumofstudents();
        Student s4= new Student("19b405789","KBTU","Dana",3.67f);
        Student s5= new Student("19b047891","KBTU","Galym",3.40f);
        s1.shownumofstudents();
        s1.showgpa();
        s2.showgpa();
        s3.showgpa();
        s4.showgpa();
        s5.showgpa();

    }
}
class Student{
    String name;
    String univercity;
    String id;
    float gpa;
    static int numofstudents=0;
    Student(){}
    Student(String n, String u, String i,float g){
        name=n;
        univercity=u;
        id=i;
        gpa=g;
        numofstudents++;
    }
    void showgpa(){
        System.out.println(gpa);
    }
    void showuniversity(){
        System.out.println(univercity);
    }
    void shownumofstudents(){
        System.out.println(numofstudents);
    }
}