package com.iteso.strategy3.behaviors;

import com.iteso.strategy3.behaviors.impl.HighDefense;
import com.iteso.strategy3.behaviors.impl.MediumAttack;
import com.iteso.strategy3.behaviors.impl.MediumDefense;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Aldo on 22/09/2015.
 */
public class MediumDefenseTest {
    @Test
    public void testMediumDefense(){
        MediumDefense mediumDefense = new MediumDefense();
        assertEquals("I'm defending mediumly", mediumDefense.defend());


    }
}
