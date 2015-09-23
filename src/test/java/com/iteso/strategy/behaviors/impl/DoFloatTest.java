package com.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by jose luis on 23/09/2015.
 */
public class DoFloatTest {
    @Test
    public void dofloatTest(){
        DoFloat dofloat = new DoFloat();
        assertEquals("I do float", dofloat.floating());
    }
}