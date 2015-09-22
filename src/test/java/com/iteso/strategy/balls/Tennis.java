package com.iteso.strategy.balls;

import org.junit.Test;

/**
 * Created by jose luis on 22/09/2015.
 */
public class Tennis {

    @Test
    public void testTennis() {
        Tennis tennis = new tennis();
        assertEquals("I'm bouncing normally!", tennis.performBounce());
        assertEquals("I'm deflating!", tennis.performDeflate());
        assertEquals("I'm inflating!", tennis.performInflate());
        assertEquals("Soccer ball is rolling!", tennis.roll());
    }


}
