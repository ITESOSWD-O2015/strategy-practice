package com.iteso.strategy2.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Aldo on 22/09/2015.
 */
public class FoamFloatsTest {

    @Test
    public void testArmBans(){
        FoamFloats foamFloats = new FoamFloats();
        assertEquals("I can't deflate!", foamFloats.performDeflate());
        assertEquals("I can't inflate!", foamFloats.performInflate());
    }
}
