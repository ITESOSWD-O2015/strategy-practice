package com.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class PingPongBallTest {

@Test
    public void PingPongBallTest(){

    PingPongBall pingpongball = new PingPongBall();
    assertEquals("I'm bouncing normally!",pingpongball.performBounce());
    assertEquals("I can't deflate!", pingpongball.performDeflate());
    assertEquals("I can't inflate!", pingpongball.performInflate());
    assertEquals("Im floating!!", pingpongball.performFloat());
    assertEquals("PingPong ball is rolling!", pingpongball.roll());

}

}
