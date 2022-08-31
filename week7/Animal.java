//Parent class
public class Animal {
    protected String sound;
    public Animal(String sound){
        this.sound=sound;
    }

    public String getSound(){
        return sound;
    }
    public static void main(String[] args) {
        Dog dog=new Dog();
        System.out.print(dog.getSound());
    }
}

//Child class
class Dog extends Animal{
    public Dog(){
        super("woof-woof-woof");
    }
}
