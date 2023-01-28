package GrupCalismasi;

public class Q15 {
    public static void main(String[] args) {
        //Bir tamsayıdaki rakamların toplamını bulmak için kodu yazınız.
        int sayi= 12354765;
        String strSayi=""+sayi;
        int toplam = 0;
        for (int i = 0; i <strSayi.length() ; i++) {
           toplam += Integer.parseInt(strSayi.substring(i,i+1));
        }
        System.out.println(toplam);
    }
}
