package com.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GeraCruz on 22/09/15.
 */
public class BowlingBallTest {
    @Test
    public void testBowlingBall() {
        BowlingBall BowlingBall = new BowlingBall();
        assertEquals("I crashed!! I can't bounce", BowlingBall.performBounce());
        assertEquals("I can't deflate", BowlingBall.performDeflate());
        assertEquals("I can't inflate", BowlingBall.performInflate());
        assertEquals("Bowling ball is rolling!", BowlingBall.roll());
    }
}
