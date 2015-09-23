package com.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GGGK4 on 22/09/2015.
 */
public class PoolBallTest {

    @Test
    public void testPoolBall(){
        PoolBall poolBall = new PoolBall();
        assertEquals("Hey, I'm not floating", poolBall.performFloat());
        assertEquals("I can't deflate!", poolBall.performDeflate());
        assertEquals("I'm bouncing irregularly!", poolBall.performBounce());
        assertEquals("Pool Ball is rolling!", poolBall.roll());


    }
}
