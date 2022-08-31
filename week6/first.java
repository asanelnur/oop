//An aggregation 
public class first{
    public static void main(String[] args) {
        Name n=new Name("Ramazan","Arman","Asyluly");
        Address a=new Address("Zhymkent","Gagarin",43);
        Student student=new Student(n,"20B154302",a);
        student.printname();
        student.printid();
        student.printaddress();
    }
}
public class Student{
    //Aggregating class
    private Name name;
    private String id;
    private Address address;
    Student(Name n,String id,Address a){
        name=n;
        this.id=id;
        address=a;
    }
    public void printname(){
        System.out.println(name.getname());
    }
    public void printid(){
        System.out.println(id);
    }
    public void printaddress(){
        System.out.println("Address:"+address.getaddress());
    }
}
public class Name{
    //Aggregated class
    String firstname;
    String secondname;
    String lastname;
    Name(String fn,String sn,String ln){
        firstname=fn;
        secondname=sn;
        lastname=ln;
    }
    public String getname(){
        return firstname+" "+secondname+" "+lastname;
    }
}
public class Address{
    //Aggregated class
    String city;
    String street;
    int home_number;
    Address(String c,String s,int hn){
        city=c;
        street=s;
        home_number=hn;
    }
    public String getaddress(){
        return city+", "+street+", "+home_number;
    }
}
//aggregation-white: Engine ----- Car
//composition-black Page ------Book
//Inheritance- an "is a" relationship : Student is a person;
//Association - a "has a" relationship : A car has an engine and a wheel;