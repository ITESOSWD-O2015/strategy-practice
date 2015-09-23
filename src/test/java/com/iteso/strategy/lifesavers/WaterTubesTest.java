package com.iteso.strategy.lifesavers;

import com.iteso.strategy2.lifesavers.WaterTubes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GGGK4 on 22/09/2015.
 */
public class WaterTubesTest {

    @Test
    public void testWaterTubes(){
        WaterTubes waterTubes = new WaterTubes();
        assertEquals("I'm floating", waterTubes.floating());
        assertEquals("I'm a Water Tube", waterTubes.display());

    }
}
