//Fibonacci sayıların ilk 10 terimini ekrana yazan program
//1 1 2 3 5 8 13 21 ..
public class h46 {
    public static void main(String[] args) {
        int fb1=1;
        int fb2=1;
        int fbn;
        System.out.print(fb1 +" " +fb2);
        for(int i=3;i<=10; i++){
            fbn=fb1+fb2;
            fb1= fb2;
            fb2=fbn;
            System.out.print(" "+fbn+" ");


        }


    }
}
