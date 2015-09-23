package com.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Feelpaa on 22/09/2015.
 */
public class BillarBallTest {

    @Test
    public void testBillarBall() {
        BillarBall billarball = new BillarBall();
        assertEquals("I'm bouncing normally!", billarball.performBounce());
        assertEquals("I can't deflate!", billarball.performDeflate());
        assertEquals("I can't inflate!", billarball.performInflate());
        assertEquals("Billar Ball is rolling!", billarball.roll());
    }
}
