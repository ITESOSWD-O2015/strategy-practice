package com.iteso.strategy.lifesavers;

import com.iteso.strategy2.lifesavers.SwimBelt;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GGGK4 on 22/09/2015.
 */
public class SwimBeltTest {

    @Test
    public void testSwimBeltTest(){
        SwimBelt swimBelt = new SwimBelt();
        assertEquals("I'm floating", swimBelt.floating());
        assertEquals("I'm a Swim Belt", swimBelt.display());

    }
}
