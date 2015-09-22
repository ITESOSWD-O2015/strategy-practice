package com.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class DoFloatTest {

    @Test
    public void testDoFloat() {
        DoFloat dofloat = new DoFloat();
        assertEquals("Im floating!!", dofloat.floats());
    }
}
