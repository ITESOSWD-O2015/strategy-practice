package com.iteso.strategy.balls;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by GGGK4 on 22/09/2015.
 */
public class BasketballBallTest {

    @Test
    public void testBasketballBall(){

        BasketballBall basketballBall = new BasketballBall();
        assertEquals("I'm bouncing normally!", basketballBall.performBounce());
        assertEquals("I'm inflating!", basketballBall.performInflate());
        assertEquals("I'm deflating!", basketballBall.performDeflate());
        assertEquals("Hi, I'm floating. n.n", basketballBall.performFloat());
        assertEquals("Basketball Ball is rolling!", basketballBall.roll());
    }
}
