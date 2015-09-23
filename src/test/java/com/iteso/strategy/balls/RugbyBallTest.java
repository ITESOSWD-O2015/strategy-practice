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
public class RugbyBallTest {
    @Test
    public void testRugbyBall() {
        RugbyBall rugbyBall = new RugbyBall();
        assertEquals("I'm bouncing irregularly!", rugbyBall.performBounce());
        assertEquals("I'm super deflating!", rugbyBall.performDeflate());
        assertEquals("I'm super inflating!", rugbyBall.performInflate());
        assertEquals("Rugby ball is rolling!", rugbyBall.roll());
        assertEquals("I'm floating!", rugbyBall.performFloat());
    }
}
