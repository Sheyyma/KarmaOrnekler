import java.util.Scanner;
public class h44 {
    //Klavyeden girilen stringlerden en uzununu bularak
//ekrana yazan ve girilen string sayısını ekrana getiren,
//string olarak 'EXIT' girildiğinde çıkış yapan program
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int enuzun=0;
        String metin="";
        String enuzunmetin="";
        int sayac=0;
        do{
            System.out.print("bir metin giriniz:");
            metin= input.nextLine();
            sayac++;
            if(metin.length()>enuzun){
        }
            enuzun=metin.length();
          enuzunmetin=metin;
        }while(metin.equals("EXIT"));
        System.out.println("en uzun metin"+enuzunmetin);
        System.out.println("en uzun metnin uzunluğu"+enuzun);



    }
}
