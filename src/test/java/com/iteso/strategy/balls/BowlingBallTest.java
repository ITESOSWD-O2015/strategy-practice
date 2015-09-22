package com.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/12/13
 * Time: 3:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class BowlingBallTest {
    @Test
    public void testBasketballBall() {
        BowlingBall bowlingBall = new BowlingBall();

        assertEquals("I'm bouncing irregularly!", bowlingBall.performBounce());
        assertEquals("I can't deflate!", bowlingBall.performDeflate());
        assertEquals("I can't inflate!", bowlingBall.performInflate());
        assertEquals("I can't float!", bowlingBall.performFloat());
        assertEquals("Bowling Ball is rolling!", bowlingBall.roll());
    }
}
