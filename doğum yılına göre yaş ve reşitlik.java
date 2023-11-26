import java.util.Scanner;
public class deneme6 {
    public static void main(String[] args) {
        int dogumyili, yil=2023;
        Scanner input= new Scanner(System.in);
        System.out.print("doğum yılınızı giriniz:");
        dogumyili= input.nextInt();
        int yas=yil-dogumyili;
        if (yas<18){
            System.out.println("reşit değil");
        }else{
            System.out.println("reşit");
        }

    }
}
