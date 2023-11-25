public class h23 {
   // For döngüsü kullanarak "Firat Universitesi Bilgisayar Mühendisliği" cümlesindeki a ve i
   // harflerinin adedini bulan bir program yazınız:
   public static void main(String[] args) {
       int ai=0;
       int ii=0;
       String cumle = "Firat_Universitesi_Bilgisayar_Mühendisliği";
       for(int i=0 ; i<cumle.length(); i++){
           char c= cumle.charAt(i);
           if (c=='a'){
               ai++;
           }if(c=='i'){
               ii++;
           }

       }
       System.out.println("a adet sayısı:"+ ai);
       System.out.println("i adet sayısı:"+ ii);
   }
}
