package com.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GGGK4 on 22/09/2015.
 */
public class PingPongBallTest {

    @Test
    public void testPingPongBall(){
        PingPongBall pingPongBall = new PingPongBall();
        assertEquals("Hi, I'm floating. n.n", pingPongBall.performFloat());
        assertEquals("I can't deflate!", pingPongBall.performDeflate());
        assertEquals("I'm bouncing normally!", pingPongBall.performBounce());
        assertEquals("Ping Pong Ball is rolling!", pingPongBall.roll());


    }
}
