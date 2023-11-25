public class h11 {
    // bugün salıysa 100 gün sonra hangi gün olur
    public static void main(String[] args) {
        int pzt, sali, car, per, cuma, cmts, pzr;
        int gun= (100%7);

        switch (gun){

            case 0:
                System.out.println("salı");
                break;
            case 1:
                System.out.println("çarşamba");
                break;
            case 2:
                System.out.println("perşembe");
                break;
            case 3:
                System.out.println("cuma");
                break;
            case 4:
                System.out.println("cumartesi");
                break;
            case 5:
                System.out.println("pazar");
                break;
            case 6:
                System.out.println("pazartesi");
                break;
        }
    }
}
