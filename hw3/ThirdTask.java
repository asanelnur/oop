import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        Integer[] list=new Integer[n];
        for(int i=0;i<n;i++){
            list[i]=input.nextInt();
        }
        Selection_Sort(list);
        for(Integer i: list){
            System.out.print(i+" ");
        }
        input.close();
    }
    static <E extends Comparable<E>> void Selection_Sort(E[] list){
        int i,j,min_index;

        for(i=0;i<list.length;i++){
            min_index=i;
            for(j=i+1;j<list.length;j++){
                if(list[j].compareTo(list[min_index])<1){
                    min_index=j;
                }
            }
            E cur=list[min_index];
            list[min_index]=list[i];
            list[i]=cur;
        }
    }
}
