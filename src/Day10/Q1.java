package Day10;

public class Q1 {
    public static void main(String[] args) {
        //Bir top belirli yükseklikten atılmaktadır.
        // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
        // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do
        // while code blogu create ediniz.
        double  topYuksekligi = 200;
        double sekmeSayisi = 0;
        double alinanYol=0;
        do {
            double yeniYukseklik;
            sekmeSayisi++;
            yeniYukseklik= topYuksekligi* (0.75);
            alinanYol +=topYuksekligi+yeniYukseklik;
            topYuksekligi=yeniYukseklik;
        } while (topYuksekligi>=100);
        System.out.println("top " + sekmeSayisi + " kadar sekmiştir " + " ve toplam " + alinanYol +" cm yol almıştır");

    }
}
