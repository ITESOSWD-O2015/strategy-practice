package com.iteso.strategy.balls;

import org.junit.Test;

/**
 * Created by jose luis on 22/09/2015.
 */
public class PingPong {

    @Test
    public void testPingPong() {
        PingPong pingpong = new basket();
        assertEquals("I'm bouncing normally!", pingpong.performBounce());
        assertEquals("I'm deflating!", pingpong.performDeflate());
        assertEquals("I'm inflating!", pingpong.performInflate());
        assertEquals("Soccer ball is rolling!", pingpong.roll());
    }

}
