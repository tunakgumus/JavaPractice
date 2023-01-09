package Day04;

public class Q01 {
    public static void main(String[] args) {
        //13 e tam bölünebilen sayilari ve toplamlarini yazdiriniz
        int toplam =0;
        for (int i = 100; i >=1 ; i--) {
            if (i%13==0){
                System.out.println(i);
                toplam +=i;
                }

            }
        System.out.println("Sayilarin toplami : " + toplam);

        }
    }
