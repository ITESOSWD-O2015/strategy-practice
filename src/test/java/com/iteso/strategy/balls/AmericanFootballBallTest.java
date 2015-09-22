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
public class AmericanFootballBallTest {
    @Test
    public void testAmericanFootballBall() {
        AmericanFootballBall americanFootballBall = new AmericanFootballBall();
        assertEquals("I'm bouncing irregularly!", americanFootballBall.performBounce());
        assertEquals("I'm deflating!", americanFootballBall.performDeflate());
        assertEquals("I'm inflating!", americanFootballBall.performInflate());
        assertEquals("American Football ball is rolling!", americanFootballBall.roll());
        assertEquals("I'm dead x.x!", americanFootball.explode());
        assertsEquals("I'm floating", americanFootball.floating());
        assertsEquals("I'm not moving!", americanFootball.notmoving());
        assertsEquals("I crashed!! I can't bounce", americanFootball.crash());
        assertsEquals("I'm dead x.x!", americanFootball.explode());

    }
}
