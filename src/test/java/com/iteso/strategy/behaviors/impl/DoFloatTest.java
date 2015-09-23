package com.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GeraCruz on 22/09/15.
 */
public class DoFloatTest {
    @Test
    public void testDoFloa() {
        DoFloat doFloat = new DoFloat();
        assertEquals("I'm Float", doFloat.Float());
    }
}
