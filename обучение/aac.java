// functions

import java.util.Scanner;

public class aac {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(func(a[i],m)+" ");
        }
        input.close();
    }
    /*public static int[] readArray(){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        input.close();
        return a;
    }*/
    public static int func(int a,int b) {
        int result=1;
        for(int i=0;i<b;i++){
            result*=a;
        }
        return result;
    }
}
