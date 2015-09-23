package com.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GGGK4 on 22/09/2015.
 */
public class BowlingBallTest {

    @Test
    public void testBowlingBall(){
        BowlingBall bowlingBall = new BowlingBall();
        assertEquals("Hey, I'm not floating", bowlingBall.performFloat());
        assertEquals("I'm bouncing irregularly!", bowlingBall.performBounce());
        assertEquals("I can't deflate!", bowlingBall.performDeflate());
        assertEquals("Bowling Ball is rolling!", bowlingBall.roll());


    }
}
