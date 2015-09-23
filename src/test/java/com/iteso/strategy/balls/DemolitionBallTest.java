package com.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Feelpaa on 22/09/2015.
 */
public class DemolitionBallTest {

    @Test
    public void testDemolitionBall() {
       DemolitionBall demolitionBall = new DemolitionBall();
        assertEquals("I'm bouncing irregularly!", demolitionBall.performBounce());
        assertEquals("I can't deflate!", demolitionBall.performDeflate());
        assertEquals("I can't inflate!", demolitionBall.performInflate());
        assertEquals("Demolition Ball is rolling!", demolitionBall.roll());
    }
}
