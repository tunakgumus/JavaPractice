package GrupCalismasi;

public class Q12 {
    public static void main(String[] args) {
        //Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
        //işaretiyle yazdırmak için gereken kodu yazınız.
        double input = 37.79;
        String sayi=""+input;
        int noktaIndex = sayi.indexOf('.');
        String ondalikKisim=sayi.substring(noktaIndex+1);
        for (int i = 0; i <ondalikKisim.length() ; i++) {
            System.out.print("*" + ondalikKisim.substring(i,i+1) + " ");
        }
    }
}
