package Day03;

import java.util.Scanner;

public class C02_bolmeIsaretiKullanmadanBolmeIslemi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bolme islemi icin bolunen degeri giriniz : ");
        int bolunen = scan.nextInt();
        System.out.println("Bolme islemi icin bolen degeri giriniz : ");
        int bolen = scan.nextInt();
        System.out.println(bol(bolunen, bolen));


    }

    public static int bol(int bolunen, int bolen) {
        int bolum = 0;

        while (bolunen >= bolen) {
            bolunen -= bolen;
            bolum++;

        }
        return bolum;
    }
}
