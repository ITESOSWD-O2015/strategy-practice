package com.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class BowlingBallTest {

    @Test
        public void BowlingBallTest(){

        BowlingBall bowlingball = new BowlingBall();

        assertEquals("I'm bouncing normally!", bowlingball.performBounce());
        assertEquals("I can't deflate!", bowlingball.performDeflate());
        assertEquals("I can't inflate!", bowlingball.performInflate());
        assertEquals("I cant float :(", bowlingball.performFloat());
        assertEquals("Bowling Ball is rolling!", bowlingball.roll());

    }

}
