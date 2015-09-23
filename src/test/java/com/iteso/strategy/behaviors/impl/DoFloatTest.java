package com.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/7/13
 * Time: 6:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class DoFloatTest {

    @Test
    public void testDoFloat() {
        DoFloat doFloat = new DoFloat();
        assertEquals("I'm floating!", doFloat.toFloat());
    }
}
