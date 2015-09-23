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
public class BasketballBallTest {
    @Test
    public void testBasketballBall() {
        BasketballBall basketballBall = new BasketballBall();

        assertEquals("I'm bouncing normally!", basketballBall.performBounce());
        assertEquals("I'm deflating!", basketballBall.performDeflate());
        assertEquals("I'm inflating!", basketballBall.performInflate());
        assertEquals("I'm floating!", basketballBall.performFloat());
        assertEquals("Basketball ball is rolling!", basketballBall.roll());
    }
}
