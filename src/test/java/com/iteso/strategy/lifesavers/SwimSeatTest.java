package com.iteso.strategy.lifesavers;

import com.iteso.strategy2.lifesavers.SwimSeat;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GeraCruz on 22/09/15.
 */
public class SwimSeatTest {
    @Test
    public void testSwimSeat() {
        SwimSeat swimSeat = new SwimSeat();
        assertEquals("I'm Float!", swimSeat.performFloat());
        assertEquals("I'm deflating!", swimSeat.performDeflate());
        assertEquals("I'm inflating!", swimSeat.performInflate());
    }
}
