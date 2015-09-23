package com.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GGGK4 on 22/09/2015.
 */
public class PartTimeFloatTest {

    @Test
    public void testPartTimeFloat(){
        PartTimeFloat partTimeFloat = new PartTimeFloat();
        assertEquals("I'm part time floating. :P", partTimeFloat.Float());

    }
}
