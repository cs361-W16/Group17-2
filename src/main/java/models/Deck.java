package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Cameron on 2/18/2016.
 */
public abstract class Deck {

    public java.util.List<Card> deck = new ArrayList<>();

    public Deck(){

    }

    public abstract void buildDeck();

    public void shuffle() {
        long seed = System.nanoTime();
        Collections.shuffle(deck, new Random(seed));
    }

    public void remove(int i){
        deck.remove(i);
    }

    public int size(){
        return deck.size();
    }

    public Card get(int i){
        return deck.get(i);
    }

}
