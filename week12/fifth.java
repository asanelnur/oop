public class fifth{
    public static void main(String[] args) {
        Stack<Student> s=new Stack<>();
        s.push(new Student("Arman","20B987612",2));
        s.push(new Student("Aslan","19B080765",3));
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}

class Stack<T>{
    T[] elements;
    int size;

    Stack(){
        elements=(T[])new Object[10];
        size=0;
    }
    void push(T x){
        elements[size++]=x;
    }

    T pop(){
        return elements[--size];
    }
    boolean isEmpty(){
        return size==0;
    }
}

class Student{
    public String name;
    public String id;
    public int cource;
    Student(String name,String id,int cource){
        this.name=name;
        this.id=id;
        this.cource=cource;
    }
    @Override
    public String toString(){
        return name+" "+id+" "+cource;
    }
}
/*
public class Max{
    public static void main(String[] args){
        Max.max("Welcome",123);
    }
    public static <E extends Comparable<E> > E max(E o1,E o2){
        if(o1.compareTo(o2)>0){
            return o1;
        }
        return o2;
    }
}
*/