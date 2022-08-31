import java.util.ArrayList;
// import java.util.Scanner;

public class Application{
    public static void main(String[] args) {
        // Scanner input=new Scanner(System.in);
        // int n=input.nextInt();
        // Integer[] ints=new Integer[n];
        // for(int i=0;i<n;i++){
        //     ints[i]=input.nextInt();
        // }
        // System.out.println(Max.max(ints));

        // MyType[] elmts=new MyType[5];
        // elmts[0]=new MyType(2);
        // elmts[1]=new MyType(3);
        // elmts[2]=new MyType(5);
        // elmts[3]=new MyType(4);
        // elmts[4]=new MyType(1);

        // System.out.print(Max.max(elmts));


        ArrayList<Integer> ints=new ArrayList<>();
        ints.add(2);
        ints.add(3);
        ints.add(1);
        ints.add(5);
        ints.add(4);
        System.out.print(Filter.filter(ints, new Integer(2)));
    }
}