package com.iteso.strategy2;

import com.iteso.strategy2.lifesavers.WaterTubes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class WaterTubesTest {

    @Test
    public void testWaterTubes() {
        WaterTubes watertubes = new WaterTubes();

        assertEquals( "I'm deflating!", watertubes.performDeflate());
        assertEquals("I'm inflating!", watertubes.performInflate());
        assertEquals("I'm floating", watertubes.floating());
        assertEquals("I'm a Water Tubes", watertubes.display());

    }
}
