package com.iteso.strategy.lifesavers;

import com.iteso.strategy2.lifesavers.ArmBands;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GGGK4 on 22/09/2015.
 */
public class ArmBandsTest {

    @Test
    public void testArmBands(){
        ArmBands armBands = new ArmBands();
        assertEquals("I'm floating", armBands.floating());
        assertEquals("I'm a ArmBand", armBands.display());

    }
}
