public class h28 {
    // Tanımlı bir cümlede geçen sesli harflerin (ingilizce karakterler) sayısını bulan Java kodunu yazınız?
    public static void main(String[] args) {
        int sayac=0;
        String cumle= "firat universitesi";
        for( int i=0; i<cumle.length(); i++){
           char a= cumle.charAt(i);
           if(a=='a'|| a=='e' || a=='i' || a=='u'){
               sayac++;
           }
        }
        System.out.print(sayac);

    }
}
