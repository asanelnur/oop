// import java.util.Date;

public class third{
    public static void main(String[] args) {
        // Comparable<Date> c = new Date();
        // System.out.println(c.compareTo("red"));
    }
}

interface Comparable<T> {
    public int compareTo(T o);
}
// public class third{
//     public static void main(String[] args) {
//         Comparable c=new Date();
//         System.out.println(c.compareTo("red"));
//     }
// }
// interface Comparable{
//     public int compareTo(Object o);
// }