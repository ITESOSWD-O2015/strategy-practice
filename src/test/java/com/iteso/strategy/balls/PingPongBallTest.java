package com.iteso.strategy.balls;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by jose luis on 23/09/2015.
 */
public class PingPongBallTest {
    @Test
    public void pingpongballtest(){
        PingPongBall pingpongball = new PingPongBall();
        assertEquals("I do float",pingpongball.performFloat());
        assertEquals("I can't inflate!", pingpongball.performInflate());
        assertEquals("I can't deflate!", pingpongball.performDeflate());
        assertEquals("Ping-Pong ball is rolling!", pingpongball.roll());
        assertEquals("I'm bouncing normally!", pingpongball.performBounce());
    }
}