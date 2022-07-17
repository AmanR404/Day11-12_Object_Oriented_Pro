// BROKEN PROGRAM

import java.util.Random;

class udeck_of_cards{
    String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};

    String[] rank = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

    String[] Player2 = new String[4];
    String[] Player1 = new String[4];
    String[] Player3 = new String[4];
    String[] Player4 = new String[4];

    
   void shuffle(){
    Random generator = new Random();
    
    for(int i = 0; i < 4;i++){
        int randomIndex = generator.nextInt(suit.length);
        String selection1 = suit[randomIndex];

        Player1 [i] = selection1;

    }


    int randomIndex1 = generator.nextInt(rank.length);
    String selection2 = rank[randomIndex1];
   }
}