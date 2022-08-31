public class MyType implements Comparable<MyType> {
    int num;
    public MyType(int num){
        this.num=num;
    }
    @Override
    public int compareTo(MyType other){
        return this.num-other.num;
    }

    @Override 
    public String toString(){
        return "MyType["+num+"]";
    }
}
