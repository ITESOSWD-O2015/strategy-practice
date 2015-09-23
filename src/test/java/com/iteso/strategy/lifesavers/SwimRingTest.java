package com.iteso.strategy.lifesavers;

import com.iteso.strategy2.lifesavers.SwimRing;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GGGK4 on 22/09/2015.
 */
public class SwimRingTest {

    @Test
    public void testSwimRingTest(){
        SwimRing swimRing = new SwimRing();
        assertEquals("I'm floating", swimRing.floating());
        assertEquals("I'm a Swim Ring", swimRing.display());

    }
}
