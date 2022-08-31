import java.util.ArrayList;

public class Filter {
    public static <E> ArrayList<E> filter(ArrayList<E> list,E ef){
        if(list.contains(ef)){
            list.remove(ef);
        }
        return list;
    }
}
