package com.iteso.strategy.lifesavers;

import com.iteso.strategy2.lifesavers.SwimBelts;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GeraCruz on 22/09/15.
 */
public class SwimBeltsTest {
    @Test
    public void testSwimBelts(){
        SwimBelts swimBelts = new SwimBelts();
        assertEquals("I'm Float!", swimBelts.performFloat());
        assertEquals("I'm deflating!", swimBelts.performDeflate());
        assertEquals("I'm inflating!", swimBelts.performInflate());
    }
}
