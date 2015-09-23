package com.iteso.strategy3.behaviors;

import com.iteso.strategy3.behaviors.impl.HighAttack;
import com.iteso.strategy3.behaviors.impl.MediumAttack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Aldo on 22/09/2015.
 */
public class MediumAttackTest {
    @Test
    public void testMediumAttack(){
        MediumAttack mediumnAttack = new MediumAttack();
        assertEquals("I'm attacking mediumly", mediumnAttack.attack());
    }
}
