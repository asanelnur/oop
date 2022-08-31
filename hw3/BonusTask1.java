import java.util.Scanner;

public class BonusTask1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        Integer[] list=new Integer[n];
        for(int i=0;i<n;i++){
            list[i]=input.nextInt();
        }

        int key=input.nextInt();
        int ans=BinarySearch(list,key);
        if(ans==-1){
            System.out.print("Not found!");
        }else{
            System.out.print(ans);
        }
        input.close();

    }
    public static <E extends Comparable<E>> int BinarySearch(E[] list,E key){
        int index=-1;
        int low=0;
        int hight=list.length-1;
        while(low<=hight){
            int m=low+((hight-low)/2);
            if(list[m].compareTo(key)==0){
                index=m;
                break;
            }else if(list[m].compareTo(key)>0){
                hight=m-1;
            }else{
                low=m+1;
            }
        }
        return index;
    }
}
