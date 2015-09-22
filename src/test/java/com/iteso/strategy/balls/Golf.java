package com.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jose luis on 22/09/2015.
 */
public class Golf {

    @Test
    public void testGolf() {
        Golf golf = new golf();
        assertEquals("I'm bouncing normally!", golf.performBounce());
        assertEquals("I'm deflating!", golf.performDeflate());
        assertEquals("I'm inflating!", golf.performInflate());
        assertEquals("Soccer ball is rolling!", golf.roll());
    }
}
