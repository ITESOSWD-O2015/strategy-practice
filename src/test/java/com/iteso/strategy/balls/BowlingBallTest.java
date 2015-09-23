package com.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Feelpaa on 22/09/2015.
 */
public class BowlingBallTest {

    @Test
    public void testBowlingBall() {
        BowlingBall bowlingBall = new BowlingBall();
        assertEquals("I'm bouncing normally!", bowlingBall.performBounce());
        assertEquals("I can't deflate!", bowlingBall.performDeflate());
        assertEquals("I can't inflate!", bowlingBall.performInflate());
        assertEquals("BowlingBall is rolling!", bowlingBall.roll());
    }
}
