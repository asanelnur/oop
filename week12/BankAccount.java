public class BankAccount<E> {
    private E[] accounts;
    private int index;

    public BankAccount(){
        accounts=(E[])new Object[100];
        index=0;
    }

    public void add(E e){
        accounts[index]=e;
        index++;
    }

    public void print(){
        for(E e: accounts){
            System.out.println(e);
        }
    }
}
