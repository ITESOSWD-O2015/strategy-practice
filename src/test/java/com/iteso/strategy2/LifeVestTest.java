package com.iteso.strategy2;

import com.iteso.strategy2.lifesavers.LifeVests;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class LifeVestTest {

    @Test
    public void testLifeVest() {

        LifeVests lifevest = new LifeVests();

        assertEquals("I'm deflating!", lifevest.performDeflate());
        assertEquals("I'm inflating!", lifevest.performInflate());
        assertEquals("I'm floating", lifevest.floating());
        assertEquals("I'm a Life Vests", lifevest.display());

    }
}
