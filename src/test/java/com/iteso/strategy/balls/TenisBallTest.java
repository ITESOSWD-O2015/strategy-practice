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
public class TenisBallTest {
    @Test
    public void testTenisBall() {
        TenisBall tenisBall = new TenisBall();
        assertEquals("I'm bouncing normally!", tenisBall.performBounce());
        assertEquals("I can't deflate!", tenisBall.performDeflate());
        assertEquals("I can't inflate!", tenisBall.performInflate());
        assertEquals("Tenis ball is rolling!", tenisBall.roll());
        assertEquals("I'm floating!", tenisBall.performFloat());
    }
}
