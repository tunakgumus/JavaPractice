package Day04;

public class Q04 {
    public static void main(String[] args) {
        //bir sayinin mukemmel olup olmadigini bulan bir method yazdirin
        //Mukemmel sayi = bir sayinin kendisi haric bolenleri toplami kendine esitse o sayi mukemmel sayidir
        System.out.println(mukemmelSayiKontrol(6));

    }

    public static boolean mukemmelSayiKontrol(int sayi) {
        int toplam = 0;
        for (int i = 1; i <sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        if (toplam==sayi) return true;
        else return false;
    }
}
