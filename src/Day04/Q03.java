package Day04;

public class Q03 {
    public static void main(String[] args) {
        //Girilen String bir ifadedeki a harfi sayisini bulunuz ama c harfine gelirse doguden cikilsin
        String str = "Bugun hava cok guzel";
        int aSayisi = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'c') {
                break;
            } else if (str.charAt(i) == 'u') {
                aSayisi++;
            }
        }
        System.out.println(aSayisi);
    }

}
