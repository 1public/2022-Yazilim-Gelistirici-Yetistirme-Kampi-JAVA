public class Main {
    public static void main(String[] args) {
        char grade = 'D';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel: Geçtiniz");
                break;
            case 'B':
                System.out.println("Tebrikler: Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi: Geçtiniz");
                break;
            case 'D':
                System.out.println("İyi: Geçtiniz");
                break;
            case 'E':
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;
            default:
                System.out.println("Geçersiz Not Girdiniz");

        }


    }
}