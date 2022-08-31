public class dateclass {
    public static void main(String[] args) {
        java.util.Date d= new java.util.Date();
        System.out.println(d);
        d.setTime(0);
        System.out.println(d);
    }
}