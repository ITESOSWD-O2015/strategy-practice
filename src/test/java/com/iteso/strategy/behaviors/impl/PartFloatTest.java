package com.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by jose luis on 23/09/2015.
 */
public class PartFloatTest {
    @Test
    public void partfloattest(){
        PartFloat partfloat = new PartFloat();
        assertEquals("I'm part time float", partfloat.floating());
    }
}