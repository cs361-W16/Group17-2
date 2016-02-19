package models;

/**
 * Created by Cameron on 2/18/2016.
 */
public class Spanish extends Deck{

    public Spanish(){

    }

    public void buildDeck(){
        for(int i = 1; i < 13; i++){
            if(i==8){ i=10; }
            deck.add(new Card(i,Suit.Clubs));
            deck.add(new Card(i,Suit.Cups));
            deck.add(new Card(i,Suit.Swords));
            deck.add(new Card(i,Suit.Coins));
        }
    }

}
