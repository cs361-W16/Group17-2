package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Cameron on 2/18/2016.
 */
public class testDeck {

    @Test
    public void testBuildDeck(){
        Deck us = new US();
        us.buildDeck();
        assertEquals(52,us.size());
        Deck spain = new Spanish();
        spain.buildDeck();
        assertEquals(40,spain.size());
    }

    @Test
    public void testShuffle(){
        Deck us = new US();
        us.buildDeck();
        assertEquals(2,us.get(0).getValue());
        us.shuffle();
        assertNotEquals(2,us.get(0).getValue());
        us.shuffle();
        Deck spanish = new Spanish();
        spanish.buildDeck();
        assertEquals(1,spanish.get(0).getValue());
        spanish.shuffle();
        assertNotEquals(1,spanish.get(0).getValue());
    }


}
