package com.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GeraCruz on 22/09/15.
 */
public class SuperflatableTest {
    @Test
    public void testDeflate() {
        Superflatable superflatable = new Superflatable();
        assertEquals("I'm super deflating!", superflatable.deflate());
    }

    public void testInflate() {
        Superflatable superflatable = new Superflatable();
        assertEquals("I'm super inflating!", superflatable.inflate());
    }
}
