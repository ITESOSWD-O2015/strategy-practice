package com.iteso.strategy.balls;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by jose luis on 23/09/2015.
 */
public class BasketBallTest {
    @Test
    public void basketballtest(){
        BasketBall basketball = new BasketBall();
        assertEquals("I dont float",basketball.performFloat());
        assertEquals("I can't deflate!", basketball.performDeflate());
        assertEquals("I can't inflate!", basketball.performInflate());
        assertEquals("BasketBall ball is rolling!", basketball.roll());
        assertEquals("I'm bouncing irregularly!", basketball.performBounce());
    }
}
