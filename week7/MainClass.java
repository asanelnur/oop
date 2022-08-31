public class MainClass {
    public static void main(String[] args) {
        Animal1 animal1=new Animal1();
        Animal1 animal2=new Cat();
        animal1.greating();
        animal2.greating();
    }
}

class Animal1{
    public void greating(){
        System.out.println("The animal greets you.");
    }
}

class Cat extends Animal1{
    public void greating(){
        System.out.println("The cat meows.");
    }
}