package com.iteso.strategy2.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Aldo on 22/09/2015.
 */
public class SwimRingTest {

    @Test
    public void testArmBans(){
        SwimRing swimRing = new SwimRing();
        assertEquals("I'm deflating!", swimRing.performDeflate());
        assertEquals("I'm inflating!", swimRing.performInflate());
    }
}
