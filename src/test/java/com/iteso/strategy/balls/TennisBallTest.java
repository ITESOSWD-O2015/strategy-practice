package com.iteso.strategy.balls;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by jose luis on 23/09/2015.
 */
public class TennisBallTest {
    @Test
    public void tennisballtest() {
        TennisBall tennisball = new TennisBall();
        assertEquals("I do float", tennisball.performFloat());
        assertEquals("I can't inflate!", tennisball.performInflate());
        assertEquals("I can't deflate!", tennisball.performDeflate());
        assertEquals("Tennis Ball is rolling!", tennisball.roll());
        assertEquals("I'm bouncing normally!", tennisball.performBounce());
    }
}