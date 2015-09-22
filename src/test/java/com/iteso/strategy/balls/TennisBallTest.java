package com.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class TennisBallTest {

    @Test
    public void TennisBallTest() {

        TenisBall tenisball  = new TenisBall();
        assertEquals("I'm bouncing normally!", tenisball.performBounce());
        assertEquals("I can't deflate!", tenisball.performDeflate());
        assertEquals("I can't inflate!", tenisball.performInflate());
        assertEquals("I cant float all the time", tenisball.performFloat());
        assertEquals("Tenis ball is rolling!", tenisball.roll());
    }
}
