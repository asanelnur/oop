public class StackOfIntegers{
    private int[] elements;
    private int size;
    public static final int Defaut_Capacity=16;
    public StackOfIntegers(){
        this(Defaut_Capacity);
    }
    public StackOfIntegers(int capacity){
        elements=new int[capacity];
    }
    public void push(int value){
        if(size >= elements.length){
            int[] temp =new int[elements.length*2];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements=temp;
        }

        elements[size++]=value;
    }
    public int pop(){
        return elements[--size];
    }
    public boolean empty(){
        if(size>0) return false;
        return true;
    }
    public int getsize(){
        return size;
    }
    public static void main(String[] args) {
    }
}