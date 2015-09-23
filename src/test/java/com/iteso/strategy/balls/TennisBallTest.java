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
public class TennisBallTest {
    @Test
    public void testTennisBall() {
        TennisBall tennisBall = new TennisBall();
        assertEquals("I'm bouncing irregularly!", tennisBall.performBounce());
        assertEquals("I can't deflate!", tennisBall.performDeflate());
        assertEquals("I can't inflate!", tennisBall.performInflate());
        assertEquals("TennisBall is rolling!", tennisBall.roll());
    }
}
