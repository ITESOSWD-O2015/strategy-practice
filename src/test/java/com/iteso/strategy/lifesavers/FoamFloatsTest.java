package com.iteso.strategy.lifesavers;

import com.iteso.strategy2.lifesavers.FoamFloats;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GeraCruz on 22/09/15.
 */
public class FoamFloatsTest {
    @Test
    public void testFoamFloats(){
        FoamFloats foamFloats = new FoamFloats();
        assertEquals("I'm Float 5 seconds!", foamFloats.performFloat());
        assertEquals("I can't deflate!", foamFloats.performDeflate());
        assertEquals("I can't inflate!", foamFloats.performInflate());
    }
}
