package Day09;

import java.util.Scanner;

public class Q1 {
    //Saati saniyeye, mili kmye, kg ı g a çeviren method yazin.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen dönüştürmek istediginiz islemi seciniz: \n Saat  \n Mil  \n Kg ");
        char islem = scan.next().toLowerCase().charAt(0);
        System.out.println("Lütfen miktar giriniz");
        double miktar = scan.nextDouble();
        cevirici(islem, miktar);
    }
    public static void cevirici (char islem ,double sayi){
        double sayi2=1;
        if (islem=='s'){
            sayi2= sayi*60*60;
            System.out.println(sayi + " saat," + sayi2 +" saniyedir.");
        }
        if (islem=='m'){
            sayi2= sayi*1600;
            System.out.println(sayi + " mil," + sayi2 +" kmdir.");
        }
        if (islem=='k'){
            sayi2= sayi*1000;
            System.out.println(sayi + " kg," + sayi2 +" grdir.");
        }
    }

}
