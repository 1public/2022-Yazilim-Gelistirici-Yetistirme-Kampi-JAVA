public class Main {
    public static void main(String[] args) {
        int sayi1 = 250;
        int sayi2 = 235;
        int sayi3 = 222;

        int bsayi = sayi1;

        if (bsayi<sayi2){
            bsayi = sayi2;
        }
        if (bsayi < sayi3){
            bsayi = sayi3;
        }
        System.out.println("En büyük sayı: " + bsayi);
    }
}