import java.util.Scanner;
public class fxdeger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, fx;
        System.out.print("bir sayı giriniz:");
        x = input.nextDouble();
        if (x < 10) {
            fx = Math.abs(x);
        } else if (x < 100) {
        fx = 3 / (2 * Math.pow(x, 2) / 100);
    }else
        fx=Math.pow(x-10,2)/100;
        System.out.println(fx);}


        }

