package com.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class PartTimeFloatTest {

    @Test
    public void testPartTimeFloat() {
        PartTimeFloat partimefloat = new PartTimeFloat();
        assertEquals("I cant float all the time", partimefloat.floats());
    }
}
