package com.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class SuperflatableTest {

    @Test
    public void testSuperflatableDeflatable() {
        Superflatable superflatable = new Superflatable();
        assertEquals("I'm super deflating!", superflatable.deflate());
    }

    @Test
    public void testSuperflatableNotDeflatable() {
        Superflatable superflatable = new Superflatable();
        assertEquals("I'm super inflating!", superflatable.inflate());
    }



}
