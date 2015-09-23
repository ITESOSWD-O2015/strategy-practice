package com.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GeraCruz on 22/09/15.
 */
public class VolleyBallTest {
    @Test
    public void testVolleyBall() {
        VolleyBall volleyBall = new VolleyBall();
        assertEquals("I'm bouncing normally!", volleyBall.performBounce());
        assertEquals("I'm deflating!", volleyBall.performDeflate());
        assertEquals("I'm inflating!", volleyBall.performInflate());
        assertEquals("Volley Ball is rolling!", volleyBall.roll());
    }
}
