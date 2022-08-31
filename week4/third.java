public class third {
    public static void main(String[] args) {
        Student s1=new Student("Arman","20b020187",3.78,"IS");
        System.out.println(s1.name);
        System.out.println(s1.id);
        //System.out.println(s1.gpa); "The field Student.gpa is not visible"
        //s1.gpa=4.0;
        System.out.println(s1.getgpa());
        s1.setgpa(3.52);
        System.out.println(s1.getgpa());
        
        int x = 5;
		System.out.println(x);
		x=Student.changeNumber(x);
		System.out.println(x);

        Student.changename(s1);
        System.out.println(s1.name);
    }
}

class Student{
    public String name;
    public String id;
    private double gpa;
    String specialty;
    Student(){}
    Student(String n,String i, double g,String s){
        name=n;
        id=i;
        gpa=g;
        specialty=s;
    }
    public double getgpa(){
        return gpa;
    }
    public void setgpa(double g){
        gpa=g;
    }
    static int changeNumber(int a){
		a = 10;
        return a;
	}
    static void changeNumber2(int a){ // a = x = 5
		a = 10;
	}
    static void changename(Student s){
        s.name="Almas";
    }
}