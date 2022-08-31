public class Faculty extends Employee{
    public static void main(String[] args) {
        new Faculty();
    }
    public Faculty(){
        System.out.println("(4) Faculty's no-arg constructor is invoked");
    }
}

class Employee extends Person{
    public Employee(){
        this("(2) Invoke Employee's overloaded constructor");
        System.out.println("(3) Employee's no-arg constructor is invoked");
    }
    public Employee(String s){
        System.out.println(s);
    }
}

class Person{
    public Person(){
        System.out.println("(1) Person's no-arg constructor is invoked");
    }
}

/*
public A(){

}
is equivalent to
public A(){
    super();
}

public A(double d){
    //some statement
}
is equivalent to
public A(double d){
    super();
    //some statement;
}

Example: Vehicle->car->electrical 
first created: Vehicle
second created: car
third created: electrical car

Super keyword can be used in two ways:
    * to call the super class constructor
    * to call the super class methods


*/