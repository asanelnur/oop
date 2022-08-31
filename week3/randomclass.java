import java.util.Random;

public class randomclass {
    public static void main(String[] args) {
        Random random1=new Random();
        for(int i=0;i<10;i++){
            System.out.print(random1.nextInt(1000)+" ");
        }
        System.out.print("\n");
        Random random2=new Random(2);
        for(int i=0;i<10;i++){
            System.out.print(random2.nextInt(1000)+" ");
        }
        System.out.print("\n");
        Random random3=new Random(2);
        for(int i=0;i<10;i++){
            System.out.print(random3.nextInt(1000)+" ");
        }
    }
}