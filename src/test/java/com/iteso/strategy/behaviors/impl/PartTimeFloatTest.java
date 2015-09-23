package com.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by GeraCruz on 22/09/15.
 */
public class PartTimeFloatTest {
    @Test
    public void testParTimeFloat() {
        PartTimeFloat partTimeFloat = new PartTimeFloat();
        assertEquals("I'm Float 5 seconds", partTimeFloat.Float());
    }
}
