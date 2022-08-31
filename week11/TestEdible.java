public class TestEdible {
    public static void main(String[] args) {
        Object[] objects = {new Tiger(),new Chicken(),new Apple()};
        for(int i=0;i<objects.length;i++){
            if(objects[i] instanceof Edible){
                System.out.println(((Edible)objects[i]).howtoEat());
                //                   ^- Casting
            }
            if(objects[i] instanceof Animal){
                System.out.println(((Animal)objects[i]).sound());
            }
        }
    }
}

abstract class Animal{
    public abstract String sound();
}

class Tiger extends Animal{
    @Override
    public String sound(){
        return "RROOAARR";
    }
}

interface Edible{
    public abstract String howtoEat();
}

class Chicken extends Animal implements Edible{
    @Override
    public String howtoEat(){
        return "Chicken: Fry it";
    }
    @Override
    public String sound(){
        return "cock-a-doodle-doo";
    }
}
abstract class Fruits implements Edible{
}

class Apple extends Fruits{
    @Override
    public String howtoEat(){
        return "Apple: Make apple cider";
    }
}

class Orange extends Fruits{
    @Override
    public String howtoEat(){
        return "Orange: Make orange juice";
    }
}