public class h5 {
    // iki sayıyı çıkarma kullanarak bölme kalanı yazma
    public static void main(String[] args) {
        int bolunen=10;
        int bolen=2;
        int bolum=0;
       int kalan=bolunen;
        while(kalan>=bolen){
            kalan=kalan-bolen;
            bolum++;

    }
        System.out.println(bolum);
        System.out.println(kalan);

    }
}
