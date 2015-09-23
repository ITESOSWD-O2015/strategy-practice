package com.iteso.strategy.behaviors.impl;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by jose luis on 23/09/2015.
 */
public class DontFloatTest {
    @Test
    public void dontfloatTest(){
        DontFloat dontfloat = new DontFloat();
        assertEquals("I dont float", dontfloat.floating());
    }
}
