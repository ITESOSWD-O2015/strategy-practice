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
public class BasketballTest {
    @Test
    public void testBasketballBall() {
        BasketballBall basketball = new BasketballBall();
        assertEquals("I'm bouncing normally!", basketball.performBounce());
        assertEquals("I'm deflating!", basketball.performDeflate());
        assertEquals("I'm inflating!", basketball.performInflate());
        assertEquals("Basketball is rolling!", basketball.roll());
        assertEquals("I'm floating", basketball.performFloatation());
    }
}
