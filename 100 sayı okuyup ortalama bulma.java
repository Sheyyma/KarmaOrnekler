public class h9 {
    //100 sayı okuyup ortalama bulma
    public static void main(String[] args) {
        int ort=0;
        int toplam=0;
        for(int i=0; i<=100; i++){
            toplam+=i;
        }
        ort= toplam/100;
        System.out.println(ort);

    }
}
