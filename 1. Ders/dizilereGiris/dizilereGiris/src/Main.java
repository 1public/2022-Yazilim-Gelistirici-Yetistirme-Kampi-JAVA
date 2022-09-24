public class Main {
    public static void main(String[] args) {

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Efe";
        ogrenciler[1] = "Bilal";
        ogrenciler[2] = "Ali";
        ogrenciler[3] = "Berk";
        //ogrenciler [4] = "Atilla";
        //ogrenciler [5] = "Atilla";
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("------------------------------------");

        for (String ogrenci : ogrenciler){
            System.out.println(ogrenci);
        }
    }
}