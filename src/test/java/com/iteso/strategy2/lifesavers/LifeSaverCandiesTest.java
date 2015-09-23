package com.iteso.strategy2.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Aldo on 22/09/2015.
 */
public class LifeSaverCandiesTest {

    @Test
    public void testLifeSaverCandies(){
        LifeSaversCandies lifeSaverCandies = new LifeSaversCandies();
        assertEquals("I can't deflate!", lifeSaverCandies.performDeflate());
        assertEquals("I can't inflate!", lifeSaverCandies.performInflate());
    }
}
