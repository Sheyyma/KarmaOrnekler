public class obeb {
    public static void main(String[] args) {
        int sayi1=20,sayi2=25, i=2, obeb=1;
        while (i<=sayi1){
            if (sayi1 % i==0 && sayi2 %i==0) {
                obeb = i;
            } i++;
        }
        System.out.println(obeb);
    }
}
