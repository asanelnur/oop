import java.util.Scanner;

public class aab{
    public static void main(String[] args){
        /*
        Одномерные массивы

        int[] name= new int[5];
        name[0]=23;
        name[1]=24;
        name[2]=25;
        name[3]=26;
        name[4]=27;
        int[] nums= new int[] {23,24,25,26,27};
        //int[] nums= new float[] {23.23f,24.54f,25.8f,26.98f,27.34f};
        System.out.println(nums[0]);
        
        int[] a;
        int n;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the numbers of array: ");
        n=in.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter a["+i+"] = ");
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        in.close();
        */

        /*
        Двумерные массивы:
        char[][] array=new char[3][3];
        //char[][] array=new char[3][];
        //for(int i=0;i<array.length;i++)
        //    array[i]=new char[3];
        array[0][0]='C';
        System.out.println(array[0][0]);
        */
        int[][] array;
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        array=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        input.close();
    }
}