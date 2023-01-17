package Day08;

import java.text.CollationKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        //desimal degeri binary degere ceviren method olusturun
        //Ornek: 12=1 1 0 0
        int input = 12;
        System.out.println(binaryCevir(input));

    }

    private static List<Integer> binaryCevir(int input) {
    List<Integer> binary = new ArrayList<>();
    while (input>=1){
    binary.add(input%2);
    input/=2;
    }
        Collections.reverse(binary);
    return binary;
    }
}
