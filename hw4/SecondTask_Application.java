import java.util.Comparator;
import java.util.PriorityQueue;


public class SecondTask_Application {
    public static void main(String[] args) {
        PriorityQueue<Person> pq=new PriorityQueue<Person>(new AgeComparator());
        pq.add(new Person("A",18));
        pq.add(new Person("B",78));
        pq.add(new Person("C",98));
        pq.add(new Person("D",48));
        pq.add(new Person("E",28));
        while (!pq.isEmpty()){
            Person p=pq.poll();
            System.out.println(p.name+" "+p.age);
        }
    }
}

class Person{
    public String name;
    public int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}

class AgeComparator implements Comparator<Person>{
    @Override
    public int compare(Person p1,Person p2){
        return p2.age-p1.age;
    }
}