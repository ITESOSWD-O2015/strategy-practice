package com.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GeraCruz on 22/09/15.
 */
public class PoolBallTest {
    @Test
    public void testPoolBall() {
        PoolBall poolBall = new PoolBall();
        assertEquals("I'm bouncing irregularly!", poolBall.performBounce());
        assertEquals("I can't deflate!", poolBall.performDeflate());
        assertEquals("I can't inflate!", poolBall.performInflate());
        assertEquals("Pool Ball is rolling!", poolBall.roll());
    }
}
