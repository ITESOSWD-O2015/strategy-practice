package com.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GeraCruz on 22/09/15.
 */
public class NotFloatTest {
    @Test
    public void testNotFloat() {
        NotFloat notFloat = new NotFloat();
        assertEquals("Don't Float", notFloat.Float());
    }

}
