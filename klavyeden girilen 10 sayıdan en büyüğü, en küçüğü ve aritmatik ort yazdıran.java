import java.util.Scanner;
public class d2 {
    // klavyeden girilen 10 sayıdan en büyüğü, en küçüğü ve aritmatik ort yazdıran
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int eb=-99999;
        int ek=99999;
        int toplam=0;

            for(int j=0 ; j<10; j++){
                System.out.print("bir sayı giyiniz:");
        int sayi = input.nextInt();



                if(sayi>=eb){
                    eb=sayi;
                }
                if(sayi<ek){
                    ek=sayi;


                toplam+=j;}

              }
        double ort= (toplam/10);

        System.out.println(toplam);
                System.out.println("en büyük:"+eb);
                System.out.println("en küçük:"+ek);
                System.out.println("ortalama:"+ ort);



    }}