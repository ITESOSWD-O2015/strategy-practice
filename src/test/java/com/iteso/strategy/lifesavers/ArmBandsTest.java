package com.iteso.strategy.lifesavers;

import com.iteso.strategy2.lifesavers.ArmBands;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GeraCruz on 22/09/15.
 */
public class ArmBandsTest {
    @Test
    public void testArmBands(){
        ArmBands armBands = new ArmBands();
        assertEquals("I'm Float!", armBands.performFloat());
        assertEquals("I'm deflating!", armBands.performDeflate());
        assertEquals("I'm inflating!", armBands.performInflate());
    }
}
