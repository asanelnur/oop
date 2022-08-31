import java.util.ArrayList;

public class ShowUnckeckedWarning {
    public static void main(String[] args) {
        // ArrayList list=new ArrayList(); //Compile warning
        // list.add("Java Programming");
        ArrayList<String> list=new ArrayList<String>(); // no compile warning in this line
        list.add("Java Programming");
    }
}
