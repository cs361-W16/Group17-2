package models;

/**
 * Created by Cameron on 2/18/2016.
 */
public class US extends Deck {


    public US(){

    }

    public void buildDeck(){
        for(int i = 2; i < 15; i++){
            cards.add(new Card(i,Suit.Clubs));
            cards.add(new Card(i,Suit.Hearts));
            cards.add(new Card(i,Suit.Diamonds));
            cards.add(new Card(i,Suit.Spades));
        }
    }

}
