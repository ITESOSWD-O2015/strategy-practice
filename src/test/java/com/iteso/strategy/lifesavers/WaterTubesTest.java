package com.iteso.strategy.lifesavers;

import com.iteso.strategy2.lifesavers.SwimRing;
import com.iteso.strategy2.lifesavers.WaterTubes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GeraCruz on 22/09/15.
 */
public class WaterTubesTest {
    @Test
    public void testWaterTubes() {
        WaterTubes waterTubes = new WaterTubes();
        assertEquals("I'm Float!", waterTubes.performFloat());
        assertEquals("I'm deflating!", waterTubes.performDeflate());
        assertEquals("I'm inflating!", waterTubes.performInflate());
    }
}
