package com.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/12/13
 * Time: 3:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class SecretBallTest {
    @Test
    public void testSecretBall() {
        SecretBall secretBall = new SecretBall();
        assertEquals("I'm bouncing normally!", secretBall.performBounce());
        assertEquals("I'm deflating!", secretBall.performDeflate());
        assertEquals("I'm inflating!", secretBall.performInflate());
        assertEquals("Secret Ball is rolling!", secretBall.roll());
    }
}
