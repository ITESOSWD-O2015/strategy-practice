package com.iteso.strategy.lifesavers;

import com.iteso.strategy2.lifesavers.FoamFloats;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GGGK4 on 22/09/2015.
 */
public class FoamFloatsTest {

    @Test
    public void testFoamFloatTest(){
        FoamFloats foamFloats = new FoamFloats();
        assertEquals("I'm floating", foamFloats.floating());
        assertEquals("I'm a Foam Float", foamFloats.display());

    }
}
