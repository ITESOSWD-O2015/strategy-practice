package com.iteso.strategy.lifesavers;

import com.iteso.strategy2.lifesavers.LifeVest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GGGK4 on 22/09/2015.
 */
public class LifeVestTest {

    @Test
    public void testLifeVest(){
        LifeVest lifeVest = new LifeVest();
        assertEquals("I'm floating", lifeVest.floating());
        assertEquals("I'm a Life Vest", lifeVest.display());

    }
}
