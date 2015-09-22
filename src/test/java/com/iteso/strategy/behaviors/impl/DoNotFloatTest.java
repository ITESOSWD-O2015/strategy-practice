package com.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class DoNotFloatTest {

    @Test
    public void testDoNoFloat() {
        DoNotFloat donofloat = new DoNotFloat();
        assertEquals("I cant float :(", donofloat.floats());
    }
}
