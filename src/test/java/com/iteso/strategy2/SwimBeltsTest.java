package com.iteso.strategy2;

import com.iteso.strategy2.lifesavers.SwimBelts;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class SwimBeltsTest {

    @Test
    public void testSwimBelts() {

        SwimBelts swimbelts = new SwimBelts();

        assertEquals("I'm deflating!", swimbelts.performDeflate());
        assertEquals("I'm inflating!", swimbelts.performInflate());
        assertEquals("I'm floating", swimbelts.floating());
        assertEquals("I'm a Swim belts", swimbelts.display());

    }
}
