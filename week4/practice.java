public class practice {
    public static void main(String[] args) {
        University univer=new University("KBTU",12000000.02f);
        univer.addstudent("Arman","20b020187",3.78f,"IS");
        univer.addstudent("Aslan","19b022456",3.24f,"IS");
        univer.addstudent("Aisha","19b870018",3.07f,"IS");
        univer.addstudent("Daulet","19b021236",3.54f,"IS");
        univer.addstudent("Baknur","19b015423",3.78f,"IS");
        univer.addstudent("Elnur","19b029877",3.4f,"IS");
        univer.addstudent("Liya","19b022322",2.9f,"IS");
        univer.addstudent("Kim","19b022321",3.15f,"IS");
        System.out.println(univer.getnameofuniversity());
        System.out.println(univer.getbudjet());
        System.out.println(univer.getnameofuniversity()+" have "+univer.getnumofstudents()+" students:");
        univer.printstudents();
        univer.getmaxgpa();
    }
}
class Student1{
    public String name;
    private String id;
    private float gpa;
    public String specialty;
    Student1(){};
    Student1( String n, String i, float g, String s){
        name=n;
        id=i;
        gpa=g;
        specialty=s;
    }
    public float getgpa(){
        return gpa;
    }
    public String getname(){
        return name;
    }
    public void print(){
        System.out.println(name+" "+id+" "+gpa+" "+specialty);
    }
}
class University{
    public String nameofuniversity;
    private float budjet;
    public Student1[] students= new Student1[100];
    private static int cnt=0;
    University(String nameofu,float b){
        nameofuniversity=nameofu;
        budjet=b;
    }
    public void addstudent(String n, String i, float g, String s){
        students[cnt]=new Student1(n,i,g,s);
        cnt++;
    }
    public String getnameofuniversity(){
        return nameofuniversity;
    }
    public float getbudjet(){
        return budjet;
    }
    public int getnumofstudents(){
        return cnt;
    }
    public void printstudents(){
        for(int i=0;i<cnt;i++){
            students[i].print();
        }
    }
    public void getmaxgpa(){
        float max_gpa=0;
        String ans="";
        for(int i=0;i<cnt;i++){
            if(students[i].getgpa()>max_gpa){
                max_gpa=students[i].getgpa();
                ans=students[i].getname();
                break;
            }
        }
        System.out.println("The greatest gpa is: "+ans+" "+max_gpa);
    }
}
/*
TASK-1: Add at least 2 more data fields with different access modifiers
TASK-2: Add at least 2 more methods with different access modifiers
TASK-3: Create a class University that includes Student as a data field (group of students, if possible)
*/