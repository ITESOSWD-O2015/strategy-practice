package com.iteso.strategy2;

import com.iteso.strategy2.lifesavers.SwimRing;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class SwimRingTest {

    @Test
    public void testSwimRing() {

        SwimRing swimring = new SwimRing();

        assertEquals( "I'm deflating!", swimring.performDeflate());
        assertEquals("I'm inflating!", swimring.performInflate());
        assertEquals("I'm floating", swimring.floating());
        assertEquals("I'm a Swim ring", swimring.display());

    }


}
