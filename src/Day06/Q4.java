package Day06;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        //Stringlerden olusan bir arrayde ogeler 'n' veya 'k' ile bitiyorsa bas harflerini yazdiran method olustur.
        String[] isimler ={"Kemal", "Jonathan", "Mark", "Jackson","Ali"};
        isimDondurme(isimler);

    }
    public static void  isimDondurme(String[] arr){
        char ilkHarfler;
        for (int i = 0; i < arr.length ; i++) {{
                if (arr[i].endsWith("n") ||arr[i].contains("k")) {
                    ilkHarfler = arr[i].charAt(0);
                    System.out.print(ilkHarfler);
                }

            }

        }
    }
}
