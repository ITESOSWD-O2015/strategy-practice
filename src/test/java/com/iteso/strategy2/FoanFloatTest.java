package com.iteso.strategy2;

import com.iteso.strategy2.lifesavers.FoanFloats;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 22/09/2015.
 */


public class FoanFloatTest {

    @Test
    public void testFloatTest() {

        FoanFloats foanfloat = new FoanFloats();

        assertEquals("I can't deflate!", foanfloat.performDeflate());
        assertEquals("I can't inflate!", foanfloat.performInflate());
        assertEquals("I'm floating", foanfloat.floating());
        assertEquals("I'm a Foan Floats", foanfloat.display());

    }
}
