public class Max{
    static <E extends Comparable<E>> void Selection_Sort(E[] list){
        E max=list[0];
        for(E e:list){
            if(e.compareTo(max)>=1){
                max=e;
            }
        }
    }
}