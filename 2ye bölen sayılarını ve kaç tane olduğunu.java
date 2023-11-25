import java.util.Scanner;
public class h42 {
    // Klavyeden girilen bir sayının 2ye bölen sayılarını ve kaç tane olduğunu ekrana yazan java
    //kodunu yazınız?
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        int n= input.nextInt();
        int i=0;
        if(n<=1){
            System.out.print("geçersiz sayı");
        }else{
            while(n>1){
                n=n/2;
                i++;

            }
            System.out.print(i);

        }

            }
        }




