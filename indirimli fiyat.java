import java.util.Scanner;
public class indirimli {
    public static void main(String[] args) {
        int price=200, indirim1,indirim2,totalindirim;
        indirim1= price- price*10/100;
        indirim2= indirim1-indirim1*10/100;
        totalindirim= price-indirim2;
        if(totalindirim>=20){
            System.out.println("indirim 20 tl den büyüktür");
        }else{
            System.out.println("indirim 20 tl den küçüktür");
        }




    }
}
