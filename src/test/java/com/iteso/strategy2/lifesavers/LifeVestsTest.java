package com.iteso.strategy2.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Aldo on 22/09/2015.
 */
public class LifeVestsTest {

    @Test
    public void testArmBans(){
        LifeVests lifeVests = new LifeVests();
        assertEquals("I'm deflating!", lifeVests.performDeflate());
        assertEquals("I'm inflating!", lifeVests.performInflate());
    }
}
