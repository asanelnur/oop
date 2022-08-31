public class first {
    public static void main(String[] args) {
        int[] arr=new int[10];
        int k=1;
        for(int i=0;i<10;i++){
            arr[i]=k;
            k++;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        //System.out.println(arr); output:[I@49070868
        Student[] students= new Student[10];
        students[0]=new Student("Arman");
        students[1]=new Student("Almas");
        //System.out.println(students[0].printname());
        //System.out.println(students[1].printname());
        for(int i=2;i<students.length;i++){
            students[i]=new Student("name");
        }
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].printname());
        }
        //System.out.println(students); output:[LStudent;@38364841
        Student s1=new Student("A");
        System.out.println(s1.getgpa());
        s1.setgpa(3);
        System.out.println(s1.getgpa());
    }
}

class Student{
    private String name;
    public String id;
    private double gpa=4;
    String specialty;
    Student(){}
    Student(String n){
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