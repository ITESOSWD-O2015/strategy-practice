package com.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/12/13
 * Time: 11:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class SuperFlatableTest {
    @Test
    public void testSuperFlatableDeflate() {
        Superflatable superFlatable = new Superflatable();
        assertEquals("I'm super deflating!",superFlatable.deflate());

    }

    @Test
    public void testSuperFlatableInflate() {
        Superflatable superFlatable = new Superflatable();
        assertEquals("I'm super inflating!",superFlatable.inflate());

    }
}
