package models;

/**
 * Created by Cameron on 2/18/2016.
 */
public class Spanish extends Deck{

    public Spanish(){
        size=40;
    }

    public void buildDeck(){
        for(int i = 1; i < 13; i++){
            if(i==8){ i=10; }
            cards.add(new Card(i,Suit.Clubs));
            cards.add(new Card(i,Suit.Cups));
            cards.add(new Card(i,Suit.Swords));
            cards.add(new Card(i,Suit.Coins));
        }
    }

}
