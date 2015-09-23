package com.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GGGK4 on 22/09/2015.
 */
public class DoNotFloatTest {

    @Test
    public void testDoNotFloat(){
        DoNotFloat doNotFloat = new DoNotFloat();
        assertEquals("Hey, I'm not floating", doNotFloat.Float());
    }
}
