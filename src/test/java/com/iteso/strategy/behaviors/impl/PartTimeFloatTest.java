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
public class PartTimeFloatTest {

    @Test
    public void testPartTimeFloat() {
        PartTimeFloat partTimeFloat = new PartTimeFloat();
        assertEquals("I've started floating, but now i'm drowning", partTimeFloat.toFloat());
    }
}
