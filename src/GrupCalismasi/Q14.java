package GrupCalismasi;

public class Q14 {
    public static void main(String[] args) {
        //Do-while döngüsünü kullanarak konsolda 'C' ile 'A' arasındaki karakterleri yazdırmak için
        //kod yazınız.

        char krk = 'C';
        do {
            System.out.print(krk + " ");
            krk--;
        }
        while (krk>='A');
    }
}
