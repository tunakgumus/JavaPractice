package Day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        /*
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor. 2. Adim :
         * Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari
         * goster, istiyorsa tekrar urun sectir. Bu islemi alisverisi bitirmek isteyene
         * kadar tekrarla. 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini
         * toplam fiyata ekle. 4. Adim : Alisveris bitince toplam odemesi gereken tutari
         * goster.
         *
         */
        ArrayList<String> urunList =new ArrayList<>(Arrays.asList("1-Portakal","2-Mandalina","3-Elma","4-Ispanak","5-Muz"));
        ArrayList<Integer> fiyatList =new ArrayList<>(Arrays.asList(10,12,15,10,18));
        Scanner scan =new Scanner(System.in);
        int urun;
        int kilo;
        int toplam=0;
        String cevap="e";
        while (cevap.equals("e")){
            System.out.println("Lutfen istediginiz urunun numarasini yazin" + urunList);
            urun= scan.nextInt();
            System.out.println("Lutfen almak istediginiz urunun kilosunu yazin");
            kilo=scan.nextInt();
            toplam +=fiyatList.get(urun-1)*kilo;
            System.out.println("Toplam odenecek tutar: " + toplam + "TL");
            System.out.println("Isleme devam etmek icin E,bitirmek için H ye basin");
            cevap=scan.next().toLowerCase(Locale.ROOT);

        }
    }
}
