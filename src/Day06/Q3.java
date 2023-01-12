package Day06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        //kullanicinin istedigi buyuklukte diziye 0-100 arasi rastgele sayilarla doldurup kacinin ortalamanin altinda,
        // kacinin ortalmanin uzerinde oldugunu bulan method yazdirin
        dizidekiOrtalamaAltiUstuBulma();
        

    }
    public static void dizidekiOrtalamaAltiUstuBulma(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen arrayin uzunlugunu giriniz");
        int sayi = scan.nextInt();
        int toplam=0;
        int ortalama=0;
        int ortalamaAlti=0;
        int ortalamaUstu=0;
        Random rnd = new Random();
        int [] arr =new int[sayi];
        arr =new int[sayi];
        for (int i = 0; i <sayi; i++) {
            arr[i]=rnd.nextInt(100);
        }
        for (int i = 0; i < arr.length ; i++) {
            toplam +=arr[i];
        }
        ortalama=toplam/ arr.length;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]<ortalama) ortalamaAlti++;
            else ortalamaUstu++;

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("listedeki sayilarin ortalamasi : " + ortalama +
                            "\n"+ortalamaUstu + " sayi ortalamanin ustunde"+
                            "\n"+ortalamaAlti + " sayi ortalamanin altinda"  );

    }
}
