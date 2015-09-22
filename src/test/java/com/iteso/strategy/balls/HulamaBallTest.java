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
public class HulamaBallTest {
    @Test
    public void testHalumaBall() {
        HulamaBall hulamaBall = new HulamaBall();
        assertEquals("I'm bouncing normally!", hulamaBall.performBounce());
        assertEquals("I'm deflating!", hulamaBall.performDeflate());
        assertEquals("I'm inflating!", hulamaBall.performInflate());
        assertEquals("Hulamaball is rolling!", hulamaBall.roll());
        assertEquals("I'm floating", hulamaBall.performFloatation());
    }
}
