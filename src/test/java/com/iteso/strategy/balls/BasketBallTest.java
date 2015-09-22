package com.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class BasketBallTest {

    @Test
    public void BasketBallTest(){

        BasketBall basketball = new BasketBall();
        assertEquals("I'm bouncing normally!", basketball.performBounce());
        assertEquals("I'm deflating!", basketball.performDeflate());
        assertEquals("I'm inflating!",basketball.performInflate());
        assertEquals("Im floating!!", basketball.performFloat());
        assertEquals("Basketball is rolling!", basketball.roll());


    }
}
