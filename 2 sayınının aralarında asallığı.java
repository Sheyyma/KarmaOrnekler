import java.util.Scanner;
public class h39 {
    //Kullanıcıdan alınan 2 sayının aralarında asal olup olmadığını bulan, aralarında
    //asal değillerse ortak bölenlerini konsolda gösteren programı yazın.
    //İpucu: 2'den ilk girilen sayıya kadar bütün sayıları test edin, eğer herhangi biri 2 sayıyı da
    //kalansız bölüyorsa bu 2 sayı aralarında asal değildir. Böyle bir sayı yoksa aralarında asaldır.
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        boolean asalMi=true;
        System.out.print("bir sayı giriniz:");
        int sayi1= input.nextInt();
        System.out.print("bir sayı giriniz:");
        int sayi2= input.nextInt();
        System.out.println("ortak bölenleri:");
        for(int i=2; i<=sayi1; i++){
            if((sayi1%i==0)&&(sayi2%i==0)){
                System.out.println(i);
                asalMi=false;
            }

        }
        if (asalMi){
            System.out.println("yok");
            System.out.println("asaldır");

        }else{

            System.out.println("asal değil");
        }






    }
}
