package com.iteso.strategy2;

import com.iteso.strategy2.lifesavers.ArmBands;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class ArmBandTest {

    @Test
    public void testArmBand() {

        ArmBands armban = new ArmBands();

        assertEquals("I can't deflate!", armban.performDeflate());
        assertEquals("I can't inflate!", armban.performInflate());
        assertEquals("I'm floating", armban.floating());
        assertEquals("I'm a Arm bands", armban.display());

    }


}
