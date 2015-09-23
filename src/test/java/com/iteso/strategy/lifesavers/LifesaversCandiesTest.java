package com.iteso.strategy.lifesavers;

import com.iteso.strategy2.lifesavers.LifesaversCandies;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GeraCruz on 22/09/15.
 */
public class LifesaversCandiesTest {
    @Test
    public void testLifesaversCandies(){
        LifesaversCandies lifesaversCandies = new LifesaversCandies();
        assertEquals("I'm Float!", lifesaversCandies.performFloat());
        assertEquals("I can't deflate!", lifesaversCandies.performDeflate());
        assertEquals("I can't inflate!", lifesaversCandies.performInflate());
    }
}
