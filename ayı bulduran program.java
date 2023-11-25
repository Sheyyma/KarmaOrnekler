import java.util.Scanner;
public class h26 {
    //ayı bulduran program
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int ay,yil;
        System.out.print("hangi yıl:");
        yil= input.nextInt();
        System.out.print("kaçıncı ay:");
        ay=input.nextInt();


        switch(ay){
            case 1:
                System.out.print("ocak 31 gün");
                break;
            case 2:
                if((yil%400==0) || (yil%100!=0) && (yil%4==0)){
                    System.out.print("şubat 29 gün");
                }else{
                    System.out.print("şubat 28 gün");
                }

                break;
            case 3:
                System.out.print("mart 31 gün");
                break;
            case 4:
                System.out.print("nisan 30 gün");
                break;
            case 5:
                System.out.print("mayıs 31 gün");
                break;
            case 6:
                System.out.print("haziran 30 gün");
                break;
            case 7:
                System.out.print("temmuz 31 gün");
                break;
            case 8:
                System.out.print("ağustos 31 gün");
                break;
            case 9:
                System.out.print("eylül 30 gün");
                break;
            case 10:
                System.out.print("ekim 31 gün");
                break;
            case 11:
                System.out.print("kasım 30 gün");
                break;
            case 12:
                System.out.print("aralık 31 gün");
                break;

        }



        }

    }

