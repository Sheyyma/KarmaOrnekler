public class exp7 {
    // toplam m=1 den 3 e kadar, n=2 den 4 e kadar, m+n+3
    public static void main(String[] args) {
        int toplam=0;
        for (int m=1 ; m<=3 ; m++){
            for (int n=2 ; n<=4 ; n++){
                toplam+= m+n+3;
            }
        }
        System.out.println(toplam);
    }
}
