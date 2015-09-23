package com.iteso.strategy2.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Aldo on 22/09/2015.
 */
public class SwimBeltTest {

    @Test
    public void testArmBans(){
        SwimBelt swimBelt = new SwimBelt();
        assertEquals("I can't deflate!", swimBelt.performDeflate());
        assertEquals("I can't inflate!", swimBelt.performInflate());
    }
}
