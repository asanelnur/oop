public class first{
    public static void main(String[] args) {
        String s="Java Java Java";
        s=s.replaceAll("v\\w","wi");
        System.out.println(s);

        String[] a="Java1HTML2Perl".split("\\d");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        //RegEX:
        String x="Java4";
        System.out.println(x.matches(".*\\d"));
        System.out.println(x.matches("J...\\d"));
    }
}