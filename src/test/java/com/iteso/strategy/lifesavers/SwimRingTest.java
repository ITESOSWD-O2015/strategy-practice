package com.iteso.strategy.lifesavers;

import com.iteso.strategy2.lifesavers.SwimRing;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GeraCruz on 22/09/15.
 */
public class SwimRingTest {
    @Test
    public void testSwimRing(){
        SwimRing swimRing = new SwimRing();
        assertEquals("I'm Float!", swimRing.performFloat());
        assertEquals("I'm deflating!", swimRing.performDeflate());
        assertEquals("I'm inflating!", swimRing.performInflate());
    }
}
