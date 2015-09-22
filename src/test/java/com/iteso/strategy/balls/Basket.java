package com.iteso.strategy.balls;

import org.junit.Test;

/**
 * Created by jose luis on 22/09/2015.
 */
public class Basket {

    @Test
    public void testBasket() {
        Basket basket = new basket();
        assertEquals("I'm bouncing normally!", basket.performBounce());
        assertEquals("I'm deflating!", basket.performDeflate());
        assertEquals("I'm inflating!", basket.performInflate());
        assertEquals("Soccer ball is rolling!", basket.roll());
    }
}
