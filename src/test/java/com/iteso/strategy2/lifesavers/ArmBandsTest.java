package com.iteso.strategy2.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Aldo on 22/09/2015.
 */
public class ArmBandsTest {

    @Test
    public void testArmBans(){
        ArmBands armBands = new ArmBands();
        assertEquals("I'm deflating!", armBands.performDeflate());
        assertEquals("I'm inflating!", armBands.performInflate());
    }
}
