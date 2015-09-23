package com.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GGGK4 on 22/09/2015.
 */
public class SuperflatableTest {

    @Test
    public void testSuperflatableDeflating(){
        Superflatable superflatable = new Superflatable();
        assertEquals("I'm super deflating!", superflatable.deflate());

    }

    @Test
    public void testSuperdeflatableInflating(){
        Superflatable superflatable =  new Superflatable();
        assertEquals("I'm super inflating!", superflatable.inflate());
    }
}
