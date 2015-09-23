package com.iteso.strategy2.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Aldo on 22/09/2015.
 */
public class WaterTubesTest {

    @Test
    public void testArmBans(){
        WaterTubes waterTubes = new WaterTubes();
        assertEquals("I can't deflate!", waterTubes.performDeflate());
        assertEquals("I can't inflate!", waterTubes.performInflate());
    }
}
