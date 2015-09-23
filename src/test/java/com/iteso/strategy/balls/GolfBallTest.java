package com.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GeraCruz on 22/09/15.
 */
public class GolfBallTest {
    @Test
    public void testGolfBall(){
        GolfBall golfBall = new GolfBall();
        assertEquals("I'm bouncing irregularly!", golfBall.performBounce());
        assertEquals("I can't deflate!", golfBall.performDeflate());
        assertEquals("I can't inflate!", golfBall.performInflate());
        assertEquals("Golf ball is rolling!", golfBall.roll());
    }
}
