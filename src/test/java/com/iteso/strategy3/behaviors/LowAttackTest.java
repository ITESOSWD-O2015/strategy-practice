package com.iteso.strategy3.behaviors;

import com.iteso.strategy3.behaviors.impl.LowAttack;
import com.iteso.strategy3.behaviors.impl.MediumAttack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Aldo on 22/09/2015.
 */
public class LowAttackTest {
    @Test
    public void testLowAttack(){
        LowAttack lowAttack = new LowAttack();
        assertEquals("I'm attacking lowly", lowAttack.attack());
    }
}
