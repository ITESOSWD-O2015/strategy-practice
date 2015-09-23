package com.iteso.strategy3.behaviors;

import com.iteso.strategy3.behaviors.impl.HighAttack;
import com.iteso.strategy3.behaviors.impl.HighDefense;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Aldo on 22/09/2015.
 */
public class HighDefenseTest {
    @Test
    public void testHighAttack(){
        HighDefense highDefense = new HighDefense();
        assertEquals("I'm defending highly", highDefense.defend());


    }
}
