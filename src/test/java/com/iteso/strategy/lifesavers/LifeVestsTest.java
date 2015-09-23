package com.iteso.strategy.lifesavers;

import com.iteso.strategy2.lifesavers.LifeVests;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GeraCruz on 22/09/15.
 */
public class LifeVestsTest {
    @Test
    public void testLifeVest(){
        LifeVests lifeVests = new LifeVests();
        assertEquals("I'm Float!", lifeVests.performFloat());
        assertEquals("I can't deflate!", lifeVests.performDeflate());
        assertEquals("I can't inflate!", lifeVests.performInflate());
    }
}
