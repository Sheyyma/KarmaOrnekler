public class deneme3 {
    public static void main(String[] args) {
        String cumle = "Fırat Üniversitesi, Bilgisayar Mühendisliği";
        int uzunluk = cumle.length();
        char ilkarakter = cumle.charAt(0);
        char sonkarakter = cumle.charAt(uzunluk - 1);
        int ilkboslukindex = cumle.indexOf("a");
        int sonboslukindex = cumle.lastIndexOf("a");
        int vurgulindex = cumle.lastIndexOf(",");
        System.out.println(uzunluk);
        System.out.println(ilkarakter);
        System.out.println(sonkarakter);
        System.out.println(ilkboslukindex);
        System.out.println(sonboslukindex);

        String ifade = cumle.substring(0, vurgulindex);
        System.out.print("birinci ifade:" + ifade);
        String ifade1 = cumle.substring(vurgulindex + 1);
        System.out.println(ifade1);

        int index = cumle.indexOf(" ");
        String kelime = cumle.substring(0, index);
        System.out.println(kelime);

        cumle = cumle.substring(index + 1);


        index = cumle.indexOf(" ");

        String kelime2= cumle.substring(0,index);
        System.out.println(kelime2);

        String kelime3= cumle.substring(0,index);
        System.out.println(kelime3);
    }
}
