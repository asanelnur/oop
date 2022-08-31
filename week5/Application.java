package aab;

public class Application {
    public static void main(String[] args) {
        HTTPConnection cn1 = HTTPConnection.GetConnection("10.10.10.10.10","8000","123qwer");
        HTTPConnection cn2 = HTTPConnection.GetConnection("10.11.11.11.10","10000","567qwer");
        System.out.println(cn1);
        System.out.println(cn2);
    }
}
