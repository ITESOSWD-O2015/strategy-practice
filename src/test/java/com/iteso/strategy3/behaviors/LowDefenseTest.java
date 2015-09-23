package com.iteso.strategy3.behaviors;

import com.iteso.strategy3.behaviors.impl.LowDefense;
import com.iteso.strategy3.behaviors.impl.MediumDefense;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Aldo on 22/09/2015.
 */
public class LowDefenseTest {
    @Test
    public void testLowDefense(){
        LowDefense lowDefense = new LowDefense();
        assertEquals("I'm defending lowly", lowDefense.defend());


    }
}
