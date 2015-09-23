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
public class QuiditchBallTest {
    @Test
    public void testQuiditchBall() {
        QuiditchBall quiditchBall = new QuiditchBall();
        assertEquals("I'm bouncing irregularly!", quiditchBall.performBounce());
        assertEquals("I can't deflate!", quiditchBall.performDeflate());
        assertEquals("I can't inflate!", quiditchBall.performInflate());
        assertEquals("Quiditch ball is rolling!", quiditchBall.roll());
        assertEquals("I've started floating, but now i'm drowning", quiditchBall.performFloat());
    }
}
