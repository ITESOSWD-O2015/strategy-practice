package com.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GGGK4 on 22/09/2015.
 */
public class DoFloatTest {

    @Test
    public void testDoFloat(){
        DoFloat doFloat = new DoFloat();

        assertEquals("Hi, I'm floating. n.n", doFloat.Float());

    }
}
