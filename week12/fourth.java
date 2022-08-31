public class fourth {
    public static void main(String[] args) {
        GenericStack<Double> listofdouble=new GenericStack<>();
        listofdouble.push(12.112);
        listofdouble.push(3.62);
        System.out.println(listofdouble.toString());

    }
}

class GenericStack<E>{
    private java.util.ArrayList<E> list=new java.util.ArrayList<E>();

    public GenericStack(){};

    public int getSize(){
        return list.size();
    }

    public E peek(){
        return list.get(getSize()-1);
    }

    public void push(E o){
        list.add(o);
    }

    public E pop(){
        E o=list.get(getSize()-1);
        list.remove(getSize()-1);
        return o;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public String toString(){
        return "Stack: "+list.toString();
    }
}