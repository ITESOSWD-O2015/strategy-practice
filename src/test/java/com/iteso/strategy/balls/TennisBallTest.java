package com.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GGGK4 on 22/09/2015.
 */
public class TennisBallTest {

    @Test
    public void testTennisBall(){
        TennisBall tennisBall = new TennisBall();
        assertEquals("I'm bouncing normally!", tennisBall.performBounce());
        assertEquals("I can't deflate!", tennisBall.performDeflate());
        assertEquals("Hi, I'm floating. n.n", tennisBall.performFloat());
        assertEquals("Tennis Ball is rolling!", tennisBall.roll());

    }
}
