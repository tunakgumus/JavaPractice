package GrupCalismasi;

public class Q9 {
    public static void main(String[] args) {
    //Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        //A
        //A A
        //A A A
        //A A A A

        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("A"+" ");
            }
            System.out.println("");

        }
    }
}
