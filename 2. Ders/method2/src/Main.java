public class Main {
    public static void main(String[] args) {
    String mesaj = "Bugün hava çok güzel.";
    String yeniMesaj = sehirVer();
    int sayi = topla(5,7);
        System.out.println(sayi);
        System.out.println(yeniMesaj);
        int toplamSayi = topla2(3,4,5,6,6);
        System.out.println(toplamSayi);
    }
    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static  int topla(int a, int b){
        return a + b;
    }
    public  static  String sehirVer(){
        return "Ankara";
    }
    public static int topla2(int... sayilar){
        int toplam = 0;
        for (int sayi:sayilar){
            toplam = sayi + toplam;
        }
        return toplam;
    }

}