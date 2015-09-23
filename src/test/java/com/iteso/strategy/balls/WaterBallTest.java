package com.iteso.strategy.balls;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by jose luis on 23/09/2015.
 */
public class WaterBallTest {
    @Test
    public void waterballtest() {
        WaterBall waterball = new WaterBall();
        assertEquals("I do float", waterball.performFloat());
        assertEquals("I'm bouncing irregularly!", waterball.performBounce());
        assertEquals("I'm deflating!", waterball.performDeflate());
        assertEquals("I'm inflating!", waterball.performInflate());
        assertEquals("WaterBall is rolling!", waterball.roll());
    }
}
