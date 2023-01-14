package Day07;

public class Q2 {
    public static void main(String[] args) {
        // create 2D array of food:
        // print all the foods sorted

        /*
        steak
        hot dog
        cheeseburger
        -----------------------
        pizza
        pasta
        canoli
        -----------------------
        sushi
        ramen
        fried rice
        dumplings
        -----------------------
        kebab
        manto
        -----------------------
        beriyani
        masal
        curry
        chicken tikka masala
        -----------------------
        */

        String[][] food = {{"steak", "hot dog", "cheeseburger"}, {"pizza", "pasta", "canoli"},
                {"sushi", "ramen", "fried rice", "dumplings"}, {"kebab", "manto"},
                {"beriyani", "masal", "curry", "chicken tikka masala"}};

        for (String[] ulkeler:food ){
            for (String yemek:ulkeler) {
                System.out.println(yemek);

            }
            System.out.println("--------------------");
            {
                
            }
        }
        System.out.println("====================FOR LOOP===================");
        String [] ulkeler2 ={"american","italian","asian","afghani","indiani"};
        for (int i = 0; i < food.length; i++) {
            System.out.println("-----------------"+ulkeler2[i]+"-------------------");
            for (int j = 0; j < food[i].length ; j++) {
                System.out.println(food[i][j]);
            }

        }


    }
}
