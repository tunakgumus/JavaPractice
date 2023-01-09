package Day02;

import java.util.Scanner;

public class c01 {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin sayiyi rakam , pozitif , negatif sayi olup olmadığını yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();
        if (sayi>=10) System.out.println("pozitif sayi");
        else if (sayi>=0) {
            System.out.println("rakam");
        } else System.out.println("negatiftir");

        System.out.println(sayi>=0 ? (sayi>=10 ? "pozitif sayidir" : "rakamdir") : "negatif sayidir");


    }
}
