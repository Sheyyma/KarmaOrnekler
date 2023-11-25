public class h10 {
    //1-100 arası sayılardan çift olanların toplamını bulan program
    public static void main(String[] args) {
        int toplam=0;
        for(int i=0 ; i<=100; i++) {
            if (i % 2 == 0) {
                toplam = toplam + i;
            }
        }
            System.out.println(toplam);


    }
}
