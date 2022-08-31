//StackOfIntegers-LIFO(last in first out)
public class third {
    public static void main(String[] args) {
        StackOfIntegers stack =new StackOfIntegers(5);
        int[] a=new int[] {12,6,9,2,16};
        for(int i=0;i<a.length;i++){
            stack.push(a[i]);
        }
        while(!stack.empty()){
            System.out.print(stack.pop()+" ");
        }
        System.out.println();
        for(int i=1;i<=10;i++){
            stack.push(i);
        }
        while(!stack.empty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
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
}