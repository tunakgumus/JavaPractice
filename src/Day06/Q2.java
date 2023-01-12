package Day06;

public class Q2 {
    public static void main(String[] args) {
        //Elinizde bir takim farkli boyutlarda somun ve bu somunlara uyacak civatalar olsun
        //Civatalari somunlarla eşlemek icin nasil  bir algoritma yazarsiniz
        int somun [] ={1,2,3,4,5,6,7,8,9};
        int civata [] = {3,6,5,7,79,9,3,1,33};
        for (int i = 0; i < somun.length ; i++) {
            for (int j = 0; j < civata.length ; j++) {
                if (somun[i]==civata[j]){
                    System.out.println("Somunun " + (i+1) + ". elemani, civatanin " + (j+1) +
                            ". elemani ile eşleşmektedir");
                }

            }

        }
    }
}
