package com.iteso.strategy2.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Aldo on 22/09/2015.
 */
public class SwinSeatTest {

    @Test
    public void testArmBans(){
        SwimSeat swimSeat = new SwimSeat();
        assertEquals("I'm deflating!", swimSeat.performDeflate());
        assertEquals("I'm inflating!", swimSeat.performInflate());
    }
}
